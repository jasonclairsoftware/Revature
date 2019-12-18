package dev.jason.app;

public abstract class Animal {

	private String spicies;
	
	public Animal(String spicies) {
		this.setSpicies(spicies);
	}
	
	public Animal() {
		this.setSpicies("void critter");
	}

	public String getSpicies() {
		return spicies;
	}

	public void setSpicies(String spicies) {
		this.spicies = spicies;
	}	
	
	public abstract void cry();
	
	public void discribeSelf() {
		System.out.println("SPICIES :" + this.getSpicies());
	}
}
