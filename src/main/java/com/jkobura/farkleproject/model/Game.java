package com.jkobura.farkleproject.model;
import java.util.UUID;

public class Game {

    private final String gameId;

    public Game(){
        gameId = UUID.randomUUID().toString();
    }

    public String getGameId(){
        return this.gameId;
    }

}
