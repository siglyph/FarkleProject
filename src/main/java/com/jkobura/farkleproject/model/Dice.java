package com.jkobura.farkleproject.model;

public class Dice {

    // DICE FIELDS //

    private static final int MAX_FACE_VALUE = 6;
    private static final int MIN_FACE_VALUE = 1;

    private int faceValue; // Assigned by Cup
    private int diceNumber;

    public Dice(int diceNumber){
        this.diceNumber = diceNumber;
    }

    // DICE METHODS //

    // Getter for diceNumber
    public int getDiceNumber() {
        return diceNumber;
    }
    // Getter for value
    public int getFaceValue(){
        return faceValue;
    }
    // Setter for value
    public void setFaceValue(int value){
        this.faceValue = value;
    }

    // Randomize face value
    public void randomizeFaceValue(){
        this.faceValue = (int)(Math.random() * MAX_FACE_VALUE + MIN_FACE_VALUE);
    }


}

