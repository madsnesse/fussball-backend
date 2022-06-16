package com.fuss.league;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LeagueRepository extends JpaRepository<League, Long> {

    @Query(value = "select l from League l where l.id = :#{#id}")
    League getById(@Param("id") Long id);}
