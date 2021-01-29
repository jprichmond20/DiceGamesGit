package edu.coe.hughes;

public class Main {
	static final int GAMES_PLAYED = 10000000;

    public static void main(String[] args) {
		Craps game = new Craps();
		int wins = 0;
		boolean victory;

    	System.out.println("Playing Craps");
		for (int i = 0; i < GAMES_PLAYED; i++){
			victory = game.playGame();
			if (victory){
				wins++;
			}
		}
		System.out.print("Winning percentage:  "+ (double)wins/GAMES_PLAYED);
    }
}
