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
	
	public void cry() {
		System.out.println("Makes an aminal sound...");
	}
	
	public void discribeSelf() {
		System.out.println("SPICIES :" + this.getSpicies());
	}
}
