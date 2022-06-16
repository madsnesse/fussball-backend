package com.fuss.exception;

public class PlayerNotFoundException extends RuntimeException{

    private Long id;
    public PlayerNotFoundException(Long playerId) {
        super();
        this.id = playerId;

    }

    public Long getId() {
        return id;
    }
}
