package com.fuss.match;

import com.fuss.league.League;
import com.fuss.player.Player;
import com.fuss.ranking.RankKey;

import javax.persistence.*;


@Entity
public class Match {
    @Id
    @GeneratedValue
    @Column(name="match_id")
    Long id;


    private Long playerOne;

    private Long playerTwo;

    private Integer scoreOne;

    private Integer scoreTwo;

    private Long league;

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
