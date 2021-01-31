package edu.coe.richmond;

import java.util.Random;

public class Dice {
    private int numSides;
    private int face;
    private Random roller = new Random();

    public Dice(){
        numSides = 6;
        roll();
    }

    public Dice(int n){
        if ((n ==4) || (n==6) || (n==8)) {
            numSides = n;
        }
        else {
            throw new IllegalArgumentException("I can only create 4,6, or 8 sided dice");
        }
    }

    public int roll(){
        face = roller.nextInt(numSides) +1;
        return face;
    }

    public int getFace(){
        return face;
    }

}
