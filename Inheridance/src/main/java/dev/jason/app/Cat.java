package dev.jason.app;

public class Cat extends Animal{
	public Cat(String spicies) {
		this.setSpicies(spicies);
	}

	public void cry() {
		System.out.println("woof...");
	}
	
	public void landPurrfectly() {
		System.out.println("Landed on all fours...");
	}

	

}
