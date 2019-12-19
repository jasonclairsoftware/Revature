package dev.jason.App;

public abstract class Warrior implements Fightable{

	private String name;
	private int strength;
	private int health;
	public static int totwarriors;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	/**
	 * This is used for total damage delt to opposing force
	 * @param strength - must be greater than ZERO will default to 1 if failed
	 */
	public void setStrength(int strength) {
		if (strength > 0) this.strength = strength;
		else this.strength = 1;
	}
	public int getHealth() {
		return health;
	}
	/**
	 * The object will "die" if health <= ZERO
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	public void printInfo() {
		System.out.println("NAME :" + this.getName() + '\t'
				+ "STRENGTH :" + this.getStrength() + '\t'
				+ "HEALTH :" + this.getHealth());
	}
	
	public boolean isDead() {
		if (this.getHealth() <= 0) {
			// DEAD
			Warrior.totwarriors--;
			return true;
		}
		else return false;
	}
}
