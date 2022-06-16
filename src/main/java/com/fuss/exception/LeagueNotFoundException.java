package com.fuss.exception;

public class LeagueNotFoundException extends RuntimeException{

    private Long id;
    public LeagueNotFoundException(Long leagueId) {
        super();
        this.id = leagueId;
    }
    public Long getId() {
        return id;
    }

}
