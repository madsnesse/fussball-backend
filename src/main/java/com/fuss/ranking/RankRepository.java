package com.fuss.ranking;

import com.fuss.league.League;
import com.fuss.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

public interface RankRepository extends JpaRepository<Rank, Long> {

    @Query(value = "select r from Rank r where r.player = :#{#player} and r.league = :#{#league}")
    Rank findByPlayerAndLeague(Player player, League league);
}
