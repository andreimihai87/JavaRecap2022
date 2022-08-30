package amd.caveofprogramming.section11.game;

import java.util.Random;

public class Game {

	private GameItem[] gameItems = { new Rock(), new Paper(), new Scissors() };

	public void run() {
		
		System.out.println("Game is running...");
		
		Random randomNr = new Random();
		int index = randomNr.nextInt(gameItems.length);
		
		System.out.println(gameItems[index]);
		
	}

}
