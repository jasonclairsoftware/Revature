package dev.jason.app;

public class Bird extends Animal implements Flyable{

	@Override
	public void cry() {
		System.out.println("mooo...");
	}

	public boolean canCarry(int weight) {
		if (weight > 2) return false;
		else return true;
	}

}
