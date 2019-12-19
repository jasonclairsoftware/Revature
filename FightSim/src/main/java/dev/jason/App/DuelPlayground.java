package dev.jason.App;

import java.util.ArrayList;
import java.util.List;

public class DuelPlayground {

	public static void main(String[] args) {
		boolean isRunning = true;
		boolean isGameWon = false;
		GameState gamestate = GameState.ATTACK;
		int attacker = 0;
		List<Warrior> warriors = new ArrayList<Warrior>();
		Hero wizard = new Hero("Yolhan", 10, 500);
		warriors.add(wizard);

		{ // block scope. I don't want to keep temp
			Enemy temp = new Enemy("Gobbo", 5, 20);
			warriors.add(temp);
			temp = new Enemy("Dire Wolf", 15, 30);
			warriors.add(temp);
			temp = new Enemy("Phil", 30, 35);
			warriors.add(temp);
		}



		////////////// MAIN GAME LOOP \\\\\\\\\\\\\\\\
		do {
			switch (gamestate) {
			case ATTACK:
			
				do {
					boolean isAttackerHero = (warriors.get(attacker) instanceof Hero);
					int probtarget = (int) (Math.random() * warriors.size());
					boolean isprobtargethero = (warriors.get(probtarget) instanceof Hero);

					// Is Hero attacking enemy
					if (isAttackerHero && !isprobtargethero && probtarget != attacker) {
						warriors.get(attacker).attack(warriors.get(probtarget));
						break;
					}
					if (!isAttackerHero && isprobtargethero && probtarget != attacker) {
						warriors.get(attacker).attack(warriors.get(probtarget));
						break;
					}
				} while (true);
				gamestate = GameState.UPDATE;

				break;
			case UPDATE:

				List<Warrior> removelist = new ArrayList<Warrior>();

				// Checking healths for removal
				for (int i = 0; i < warriors.size(); i++) {

					if (warriors.get(i).isDead()) {
						System.out.println(warriors.get(i).getName() + " has died...");
						removelist.add(warriors.get(i));
					}
				}


				// Removing deados from active list
				for (int i = 0; i < removelist.size(); i++) {

					warriors.remove(removelist.get(i));
				}

				removelist.clear();

				// Showing current stats
				for (Warrior warrior : warriors)
					warrior.printInfo();

				// Checking win condition
				// Is there an exsisting Hero
				boolean isHeroAlive = false;
				boolean isEnemyAlive = false;
				for (Warrior warrior : warriors) {
					if (warrior instanceof Hero)
						isHeroAlive = true;
					if (warrior instanceof Enemy)
						isEnemyAlive = true;
				}
				if (!isHeroAlive && !isEnemyAlive)
					System.out.println("DRAW"); // DRAW
				if (isHeroAlive && !isEnemyAlive) {
					isGameWon = true;
					isRunning = false;
					System.out.println("HERO WINS");
				} // WIN
				if (isEnemyAlive && !isHeroAlive) {
					isGameWon = false;
					isRunning = false;
					System.out.println("HERO HAS FALLEN");
				} // LOSS
				else {
					// CONTINUE FIGHTING
					if (attacker + 1 >= warriors.size()) {
						attacker = 0;
					} else attacker++;
					

					gamestate = GameState.ATTACK;
				}

				break;

			} // END SWITCH
		} while (isRunning); // END GAME LOOP

	}
}
