package edu.coe.hughes;

public class Craps {
    private Dice d1;
    private Dice d2;
    private int point;
    private int nextRoll;


    public Craps(){
        d1 = new Dice();
        d2 = new Dice(6);
    }

    public boolean playGame(){
        point = d1.roll()+ d2.roll();

        if ((point == 2) || (point == 3) || (point == 12)){
            return false;
        }
        else if ((point == 7) || (point == 11)){
            return true;
        }
        else{
            nextRoll = d1.roll() + d2.roll();
            while (nextRoll != point && nextRoll != 7){
                nextRoll = d1.roll() + d2.roll();
            }
            if (nextRoll == point){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
