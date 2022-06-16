package com.fuss.ranking;

import com.fuss.league.League;
import com.fuss.player.Player;

import javax.persistence.*;

@Entity
public class Rank {

    @EmbeddedId
    RankKey id;

    @MapsId("playerId")
    @JoinColumn(name="player_id")
    @ManyToOne
    private Player player;

    @MapsId("leagueId")
    @JoinColumn(name="league_id")
    @ManyToOne
    private League league;


    private Integer ranking;


    public Rank(Player player, League league, Integer ranking) {
        this.player = player;
        this.league = league;
        this.id = new RankKey(player.getId(), league.getId());
        this.ranking = ranking;
    }
    public Rank(Player player, League league) {
        this.player = player;
        this.league = league;
        this.ranking = 2000;
    }

    public Rank() {

    }
    public Integer getRanking() {
        return ranking;
    }
}
