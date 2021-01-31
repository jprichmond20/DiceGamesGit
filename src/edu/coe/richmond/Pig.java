package edu.coe.richmond;
import java.util.*;
public class Pig {
    private Dice d1;
    private Dice d2;
    private int currRoll;
    private int p1;
    private int p2;
    private int currPoints;
    private int winner;
    private String choice;
    Scanner scnr = new Scanner(System.in);

    public Pig() {
        d1 = new Dice();
        d2 = new Dice();
        p1 = 0;
        p2 = 0;
        currPoints = 0;
        winner = 0;
        currRoll = 0;
        choice = "N";
    }

    public int playGame() {
        while (p1 < 100 && p2 < 100) {
            currPoints = currPoints + turn();
            System.out.println("Your current total is: " + currPoints);
            System.out.println("Would you like to roll again? (Y/N)");
            choice = scnr.next();
            while (choice == "Y") {
                currPoints = currPoints + turn();
                System.out.println("Your current total is: " + currPoints);
                System.out.println("Would you like to roll again? (Y/N)");
                choice = scnr.next();
            }
            if (p1 < 100) {
                p2 = p2 + turn();
            }
        }
        if (p1 >= 100) {
            winner = 1;
        }
        else {
            winner = 2;
        }
        return winner;
    }

    public int turn() {
        boolean hold = false;
        do {
            currRoll = d1.roll();
            if (currRoll == 1) {
                currPoints = 0;
                return currPoints;
            }
            else {
                currPoints = currPoints + currRoll;
            }
        }
        while (hold == false);
        return currPoints;
    }
}
