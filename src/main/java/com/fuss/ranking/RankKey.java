package com.fuss.ranking;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RankKey implements Serializable {

    @Column(name = "player_id")
    Long playerId;

    @Column(name = "league_id")
    Long leagueId;

    public RankKey(Long playerId, Long leagueId) {
        this.playerId = playerId;
        this.leagueId = leagueId;
    }

    public RankKey() {

    }
}
