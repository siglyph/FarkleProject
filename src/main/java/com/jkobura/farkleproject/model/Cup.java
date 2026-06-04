package com.jkobura.farkleproject.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cup {
    private static final int MAX_CAPACITY = 6;

    ArrayList<Dice> diceList = new ArrayList<>(MAX_CAPACITY);

    public Cup(){

        // For each index in diceList, create a new dice
        for (int i = 1; i < MAX_CAPACITY + 1; i++){
            diceList.add(new Dice(i));
        }

    }

    // Randomizes dice in cup
    public void shakeCup(){

        for (Dice dice : diceList){
            dice.randomizeFaceValue();
        }

    }

}

