package dev.jason.App;

public class Hero extends Warrior{

	public Hero(String name, int strength, int health) {
		this.setName(name);
		this.setStrength(strength);
		this.setHealth(health);
		Warrior.totwarriors++;
	}

	public void attack(Warrior target) {
		target.setHealth(target.getHealth() - this.getStrength());
		
		System.out.println(this.getName() + " attacks " + target.getName() + " dealing " + this.getStrength() + " hit points!");
		
	}


}
