package dev.jason.App;


public class DuelPlayground {

	public static void main(String[] args) {
		
		Game game = new Game();

		////////////// MAIN GAME LOOP \\\\\\\\\\\\\\\\
		do {
			switch (Game.gamestate) {
			case ATTACK:
				game.Attack();
				break;
			case UPDATE:
				game.Update();
				break;

			} // END SWITCH
		} while (Game.isRunning); // END GAME LOOP

	}
}
