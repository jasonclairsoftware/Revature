package dev.jason.App;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends JFrame {

	public static boolean isRunning;
	public static GameState gamestate;
	private int attacker = 0;
	private List<Warrior> warriors;
	public Clock timer;
	String message = "null";

	Screen s;

	public Game() {
		Game.isRunning = true;
		Game.gamestate = GameState.ATTACK;
		this.attacker = 0;
		warriors = new ArrayList<Warrior>();
		// Starting the game clock
		timer = new Clock();
		timer.start();

		this.setTitle("Fighter Sim");
		this.setSize(472 * 2, 243 * 2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Hero wizard = new Hero("Yolhan", 10, 250, 200, 240, 280, 320, "/hero.png", 3);
		warriors.add(wizard);
		Enemy temp;

		temp = new Enemy("Alpha Wolf", 15, 30, 580, 120, 664, 190, "/direwolf.png", 3);
		warriors.add(temp);
		temp = new Enemy("Delta Wolf", 15, 30, 500, 175, 584, 245, "/direwolf.png", 3);
		warriors.add(temp);
		temp = new Enemy("Omega Wolf", 15, 30, 590, 220, 674, 290, "/direwolf.png", 3);
		warriors.add(temp);

		this.initGraphics();

	}

	public void Update() {
		List<Warrior> removelist = new ArrayList<Warrior>();

		// Checking healths for removal
		for (int i = 0; i < warriors.size(); i++) {

			if (warriors.get(i).isDead()) {
				// System.out.println(warriors.get(i).getName() + " has died...");
				removelist.add(warriors.get(i));
				this.message = warriors.get(i).getName() + " has died...";
				warriors.get(i).setAniState(3);
				s.Update(this.message);
				// Pausing the game
				this.timer.resetTimer();
				do {
					if (this.timer.elapsedTime() >= 3)
						break;
				} while (true);

			}

		}

		// Removing deados from active list
		for (int i = 0; i < removelist.size(); i++) {

			warriors.remove(removelist.get(i));
		}

		removelist.clear();
		// Showing current stats
		for (Warrior warrior : warriors) {
			this.message = warrior.printInfo();
			this.s.Update(this.message);

			// Pausing the game
			this.timer.resetTimer();
			do {
				if (this.timer.elapsedTime() >= 1)
					break;
			} while (true);
		}

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
			isRunning = false;
			// System.out.println("HERO WINS");
			this.message = "HERO WINS";
			s.Update(this.message);
			// Pausing the game
			this.timer.resetTimer();
			do {
				if (this.timer.elapsedTime() >= 1)
					break;
			} while (true);
		} // WIN
		if (isEnemyAlive && !isHeroAlive) {
			isRunning = false;
			// System.out.println("HERO HAS FALLEN");
			this.message = "HERO HAS FALLEN";
			s.Update(this.message);
			// Pausing the game
			this.timer.resetTimer();
			do {
				if (this.timer.elapsedTime() >= 1)
					break;
			} while (true);
		} // LOSS
		else {
			// CONTINUE FIGHTING
			if (attacker + 1 >= warriors.size()) {
				attacker = 0;
			} else
				attacker++;

			gamestate = GameState.ATTACK;
		}

	}

	public void Attack() {
		do {
			boolean isAttackerHero = (warriors.get(attacker) instanceof Hero);
			int probtarget = (int) (Math.random() * warriors.size());
			boolean isprobtargethero = (warriors.get(probtarget) instanceof Hero);

			// Is Hero attacking enemy
			if (isAttackerHero && !isprobtargethero && probtarget != attacker) {
				this.message = warriors.get(attacker).attack(warriors.get(probtarget));
				s.Update(this.message);
				// Pausing the game
				this.timer.resetTimer();
				do {
					if (this.timer.elapsedTime() >= 1)
						break;
				} while (true);
				break;
			}
			if (!isAttackerHero && isprobtargethero && probtarget != attacker) {
				this.message = warriors.get(attacker).attack(warriors.get(probtarget));
				s.Update(this.message);
				// Pausing the game
				this.timer.resetTimer();
				do {
					if (this.timer.elapsedTime() >= 1)
						break;
				} while (true);
				break;
			}
		} while (true);
		Game.gamestate = GameState.UPDATE;

	}

	public int getAttacker() {
		return this.attacker;
	}

	public void initGraphics() {
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(1, 1, 0, 0));
		s = new Screen(this.warriors);
		this.add(s);
		this.setVisible(true);
	}

}
