package dev.jason.app;

public class Plane implements Flyable{

	public boolean canCarry(int weight) {
		if (weight > 1000) return false;
		else return true;
	}

	
	
	
	
	
	
}
