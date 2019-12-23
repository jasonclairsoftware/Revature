package dev.jason.App;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends Warrior {
	public Enemy(String name, int strength, int health, int px, int py, int ex, int ey, String loc, int totsprites) {
		this.setName(name);
		this.setStrength(strength);
		this.setHealth(health);
		this.setPx(px);
		this.setPy(py);
		this.setEx(ex);
		this.setEy(ey);
		this.anistate = 1;
		this.setTotSprites(totsprites);
		this.setSprite(loc);

	}

	public String attack(Warrior target) {
	
		target.setHealth(target.getHealth()-this.getStrength());
		if (target.getHealth() <= 20)
			target.setAniState(2);
		return this.getName() + " attacks " + target.getName() + " \ndealing " + this.getStrength() + " hit points!";
		
	}
	
	public void setSprite(String loc) {
		try {
		this.spritesheet = ImageIO.read(getClass().getResourceAsStream(loc));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getTotSprites() {
		return this.totSprites;
	}

	@Override
	public void setTotSprites(int totSprites) {
		if(totSprites >= 1) this.totSprites = totSprites;
	}

	@Override
	public void setAniState(int state) {
		if (state > 0 && state <=3) this.anistate = state;
		
	}

	@Override
	public int getAniState() {
		return this.anistate;
	}

}
