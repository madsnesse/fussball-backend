package com.fuss.service;

import com.fuss.league.League;
import com.fuss.league.LeagueRepository;
import com.fuss.match.Match;
import com.fuss.match.MatchEntity;
import com.fuss.match.MatchRepository;
import com.fuss.player.Player;
import com.fuss.player.PlayerRepository;
import com.fuss.ranking.Rank;
import com.fuss.ranking.RankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FussballService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FussballService.class);

    private final PlayerRepository playerRepository;
    private final RankRepository rankRepository;
    private final LeagueRepository leagueRepository;
    private final MatchRepository matchRepository;
    
    public FussballService(PlayerRepository playerRepository, RankRepository rankRepository, LeagueRepository leagueRepository, MatchRepository matchRepository){

        this.playerRepository = playerRepository;
        this.rankRepository = rankRepository;
        this.leagueRepository = leagueRepository;
        this.matchRepository = matchRepository;
    }


    public Integer getRanking(Long playerId, Long leagueId) {

        Player player = playerRepository.getById(playerId);
        League league = leagueRepository.getById(leagueId);

        Rank rank = rankRepository.findByPlayerAndLeague(player, league);
        return rank.getRanking();
    }

    private void updateRanking(Player player, Integer newRanking, League league){


        Rank rank = new Rank(player, league, newRanking);
        rankRepository.save(rank);
    }

    public void processMatch(Match m){
        LOGGER.info("processing match between player {} and {} in league {}",
                m.getPlayerIdOne(),
                m.getPlayerIdTwo(),
                m.getLeagueId());

        League league = leagueRepository.getById(m.getLeagueId());
        Player playerOne = playerRepository.getById(m.getPlayerIdOne());
        Player playerTwo = playerRepository.getById(m.getPlayerIdTwo());

        boolean playerOnewins = m.getScoreOne() > m.getScoreTwo();

        int multiplierOne = playerOnewins?1:-1;
        int multiplierTwo = !playerOnewins?1:-1;

        Rank currentRankPlayerOne = rankRepository.findByPlayerAndLeague(playerOne,
                league);
        Rank currentRankPlayerTwo = rankRepository.findByPlayerAndLeague(playerTwo,
                league);
        matchRepository.save(new MatchEntity(m.getPlayerIdOne(),
                m.getPlayerIdTwo(),
                m.getScoreOne(),
                m.getScoreTwo(),
                m.getLeagueId()));
        updateRanking(playerOne, currentRankPlayerOne.getRanking()+(10*multiplierOne), league);
        updateRanking(playerTwo, currentRankPlayerTwo.getRanking()+(10*multiplierTwo), league);
    }

    public List<Player> getAllPlayers() {

        return playerRepository.findAll();

    }
}
