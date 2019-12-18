package dev.jason.app;

public class Dog extends Animal{

	public Dog(String spicies) {
		this.setSpicies(spicies);
	}
	
	public void dig() {
		System.out.println("Dug a hole...");
	}
	
	public void cry() {
		System.out.println("ribbit");
	}
	
}
