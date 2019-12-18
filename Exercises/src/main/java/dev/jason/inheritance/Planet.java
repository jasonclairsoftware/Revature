package dev.jason.inheritance;

public class Planet extends AsteralBody{

	public Planet(String climate) {
		AsteralBody.totplanets++;
		this.setClimate(climate);
	}
	
	@Override
	public void bodyBehavior() {
		System.out.println("I orbit a star");
	}

}
