package com.fuss.dao;

import com.fuss.league.League;
import com.fuss.league.LeagueRepository;
import com.fuss.player.Player;
import com.fuss.player.PlayerRepository;
import com.fuss.ranking.Rank;
import com.fuss.ranking.RankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlayerRepository playerRepository, RankRepository rankRepository, LeagueRepository leagueRepository) {
        League testLeague1 = new League("testLeague");
        Player testPlayer1 = new Player("player1");
        Player testPlayer2 = new Player("player2");
        Rank r = new Rank(testPlayer1, testLeague1, 1969);
        Rank r1 = new Rank(testPlayer2, testLeague1, 12415);

        return args -> {
            leagueRepository.save(testLeague1);
            playerRepository.save(testPlayer1);
            playerRepository.save(testPlayer2);
            rankRepository.save(r);
            rankRepository.save(r1);
        };
    }
}