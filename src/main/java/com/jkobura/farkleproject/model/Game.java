package com.jkobura.farkleproject.model;
import java.util.UUID;

public class Game {

    private String gameId;
    private Cup cup = new Cup();

    private List currentRoll = new List<Dice>;

    private List<Dice> table = new ArrayList<>();

    public Game(){
        this.gameId = UUID.randomUUID().toString();
    }

    public void rollDice(){

    }


}