package com.fuss.service;

import com.fuss.league.League;
import com.fuss.league.LeagueRepository;
import com.fuss.match.Match;
import com.fuss.player.Player;
import com.fuss.player.PlayerRepository;
import com.fuss.ranking.Rank;
import com.fuss.ranking.RankRepository;
import org.springframework.stereotype.Service;

@Service
public class FussballService {
    
    private final PlayerRepository playerRepository;
    private final RankRepository rankRepository;
    private final LeagueRepository leagueRepository;
    
    public FussballService(PlayerRepository playerRepository, RankRepository rankRepository, LeagueRepository leagueRepository){

        this.playerRepository = playerRepository;
        this.rankRepository = rankRepository;
        this.leagueRepository = leagueRepository;
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
        League league = leagueRepository.getById(m.getLeague());

        Player winner = m.getScoreOne() > m.getScoreTwo() ?
                playerRepository.getById(m.getPlayerOne()):
                playerRepository.getById(m.getPlayerTwo());

        Player loser = m.getScoreOne() < m.getScoreTwo() ?
                playerRepository.getById(m.getPlayerOne()):
                playerRepository.getById(m.getPlayerTwo());

        Rank currentRankWinner = rankRepository.findByPlayerAndLeague(winner,
                league);
        Rank currentRankLoser = rankRepository.findByPlayerAndLeague(loser,
                league);

        updateRanking(winner, currentRankWinner.getRanking()+10, league);
        updateRanking(loser, currentRankLoser.getRanking()-10, league);
    }

}
