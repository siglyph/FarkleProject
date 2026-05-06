package com.jkobura.farkleproject.model;

public abstract class Player {

    private int tempScore;
    private int finalScore;

    public Player(){
        this.tempScore = 0;
        this.finalScore = 0;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public int getTempScore() {
        return tempScore;
    }

    public void setTempScore(int tempScore) {
        this.tempScore = tempScore;
    }

    public void addToTempScore(int score){
        this.tempScore += score;
    }

    public void addToFinalScore(int score){
        this.finalScore += score;
    }

}
