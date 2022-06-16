package com.fuss.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PlayerRepository extends JpaRepository<Player, Integer> {

    @Query(value = "select p from Player p where p.id = :#{#id}")
    Player getById(@Param("id") Long id);
}
