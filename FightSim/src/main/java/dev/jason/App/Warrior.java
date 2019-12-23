package dev.jason.App;

import java.awt.image.BufferedImage;

public abstract class Warrior{

	private String name;
	private int strength;
	private int health;
	private int px, py, ex, ey;
	protected int totSprites;
	protected int anistate;
	protected BufferedImage spritesheet;

	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getStrength() {
		return strength;
	}
	/**
	 * This is used for total damage delt to opposing force
	 * @param strength - must be greater than ZERO will default to 1 if failed
	 */
	protected void setStrength(int strength) {
		if (strength > 0) this.strength = strength;
		else this.strength = 1;
	}
	protected int getHealth() {
		return health;
	}
	/**
	 * The object will "die" if health <= ZERO
	 * @param health
	 */
	protected void setHealth(int health) {
		this.health = health;
	}
	public String printInfo() {
		return this.getName() + ' '
				+ "STR :" + this.getStrength() + ' '
				+ "HEL :" + this.getHealth();
	}
	
	public boolean isDead() {
		if (this.getHealth() <= 0) return true;
		else return false;
	}
	public int getPx() {
		return px;
	}
	public void setPx(int px) {
		if (px >= 0)
			this.px = px;
	}
	public int getPy() {
		return py;
	}
	public void setPy(int py) {
		if (py >= 0)
			this.py = py;
	}
	
	public BufferedImage getSpriteSheet() {
		return this.spritesheet;
	}
	
	public abstract void setSprite(String loc);
	public abstract int getTotSprites();
	public abstract void setTotSprites(int totSprites);
	public abstract void setAniState(int state);
	public abstract int getAniState();
	public abstract String attack(Warrior target);
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		if (ex >= 0) this.ex = ex;
	}
	public int getEy() {
		return ey;
	}
	public void setEy(int ey) {
		if (ey >= 0) this.ey = ey;
	}
}
