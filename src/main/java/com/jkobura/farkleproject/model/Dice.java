package com.jkobura.farkleproject.model;

public class Dice {

    private int faceValue;
    private boolean isInCup;

    public void randomizeFaceValue() {
        setFaceValue((int)(Math.random() * 6) + 1);
    }

    public void setFaceValue(int value){
        this.faceValue = value;
    }

    public int getFaceValue(){
        return this.faceValue;
    }

    public boolean isInCup(){
        return this.isInCup;
    }

    public void setIsInCup(boolean value){
        this.isInCup = value;
    }


}
