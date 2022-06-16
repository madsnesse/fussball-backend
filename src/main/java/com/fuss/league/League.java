package com.fuss.league;

import com.fuss.ranking.Rank;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Table
public class League {

    @Id
    @GeneratedValue
    @Column(name="league_id")
    private Long id;

    @NotBlank
    @Size(max=20)
    private String name;

    @OneToMany(mappedBy = "league")
    private Collection<Rank> playerRanks;


    public League(String name) {
        this.name = name;
    }

    public League() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playerRanks=" + playerRanks +
                '}';
    }
}
