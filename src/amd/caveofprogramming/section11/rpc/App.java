package amd.caveofprogramming.section11.rpc;

import amd.caveofprogramming.section11.game.Game;

/**
 * Rock Paper Scissors
 * @author andrew
 *
 */
public class App {

	public static void main(String[] args) {

		Game game = new Game();
		game.run();
		
		// or
		// new Game().run();

	}

}
