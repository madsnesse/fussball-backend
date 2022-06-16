package com.fuss.player;

import com.fuss.ranking.Rank;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Table
public class Player {

    @Id
    @GeneratedValue
    @Column(name="player_id")
    private Long id;

    @NotBlank
    @Size(max=20)
    private String name;

    @OneToMany(mappedBy = "player")
    private Collection<Rank> leagueRanks;

    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leagueRanks=" + leagueRanks +
                '}';
    }
}
