package dev.jason.encapsulation;

public class Car {
	private String make;
	private String model;
	private int mpg; // Miles per gallon
	
	Car() {
		this.setMake("Honda");
		this.setModel("Civic");
		this.setMpg(35);
	}
	
	Car(String make, String model, int mpg) {
		this.setMake("Honda");
		this.setModel("Civic");
		this.setMpg(mpg);
	}
	
	public void showInfo() {
		System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nMPG: " + this.mpg);
	}

	public int getMpg() {
		return mpg;
	}

	/**
	 * Cannot have mpg set below 0, it will clamp
	 * @param mpg - Miles Per Gallon
	 */
	public void setMpg(int mpg) {
		if (mpg < 0)
			this.mpg = 0;		// Clamp to 0
		else
			this.mpg = mpg;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
