package dev.jason.inheritance;

public class Moon extends AsteralBody{

	public Moon(String climate) {
		AsteralBody.totplanets++;
		this.setClimate(climate);
	}
	@Override
	public void bodyBehavior() {
		System.out.println("I orbit a planet");
		
	}

}
