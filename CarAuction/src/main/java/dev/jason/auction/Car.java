package dev.jason.auction;

public class Car {
	// Data Methods
	private String make;
	private String model;
	private short yearmanufactured;
	private int mileage;
	private float price;
	
	// CTOR's
	public Car(String make, String model, short yearmanufactured, int mileage, float price) {
		this.setMake(make);
		this.setModel(model);
		this.setYearManufactured(yearmanufactured);
		this.setMileage(mileage);
		this.setPrice(price);
	}
	
	// Getters and Setters
	public String getMake() {
		return this.make;
	}
	private void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return this.model;
	}
	private void setModel(String model) {
		this.model = model;
	}
	public short getYearManufactured() {
		return this.yearmanufactured;
	}
	/**
	 * The first car was manufactured in 1886
	 * if the passed in year is before that the method will short circuit
	 * @param ym
	 */
	private void setYearManufactured(short ym) {
		if (ym < 1886) return;
		else this.yearmanufactured = ym;
	}
	public float getPrice() {
		return this.price;
	}
	/**
	 * method will short circuit if the price passed is less than $0.00
	 * @param price
	 */
	public void setPrice(float price) {
		if (price < 0) return;
		else this.price = price;
	}
	public int getMileage() {
		return this.mileage;
	}
	private void setMileage(int mileage) {
		if (mileage >= 0 ) this.mileage = mileage;
		else return;
	}
	public void printInfo() {
		System.out.println("MAKE : " + this.getMake() + '\t'
				+ "MODEL :" + this.getModel() + '\t'
				+ "YEAR :" + this.getYearManufactured() + '\t'
				+ "MILEAGE :" + this.getMileage() + '\t'
				+ "PRICE :$" + this.getPrice());

	}
}
