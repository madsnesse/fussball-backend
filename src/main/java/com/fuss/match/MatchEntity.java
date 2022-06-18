package com.fuss.match;

import org.immutables.value.Value;

import javax.persistence.*;


@Entity
public class MatchEntity {
    @Id
    @GeneratedValue
    @Column(name="match_id")
    Long id;


    private Long playerOne;

    private Long playerTwo;

    private Integer scoreOne;

    private Integer scoreTwo;

    private Long league;

    public MatchEntity(Long playerOne, Long playerTwo, Integer scoreOne, Integer scoreTwo, Long league) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.league = league;
    }

    public Long getPlayerOne() {
        return playerOne;
    }

    public Long getPlayerTwo() {
        return playerTwo;
    }

    public Integer getScoreOne() {
        return scoreOne;
    }

    public Integer getScoreTwo() {
        return scoreTwo;
    }

    public Long getLeague() {
        return league;
    }

}
