package dev.jason.inheritance;

public abstract class AsteralBody {

	public static int totplanets = 0;
	private String climate;
	
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	
	public abstract void bodyBehavior();
	
}
