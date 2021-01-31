package edu.coe.richmond;

public class Main {
	static final int GAMES_PLAYED = 10000000;

    public static void main(String[] args) {
		//Craps game = new Craps();
		//int wins = 0;
		Pig game = new Pig();
		boolean victory = false;

    	System.out.println("Playing Craps");
		/*for (int i = 0; i < GAMES_PLAYED; i++){
			victory = game.playGame();
			if (victory) {
				wins++;
			}
		}
		*/

		System.out.println("The winner is player " + game.playGame());

		//System.out.print("Winning percentage:  "+ (double)wins/GAMES_PLAYED);
    }
}
