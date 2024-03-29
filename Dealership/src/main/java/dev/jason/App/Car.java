package dev.jason.App;

public class Car {

	private String make;
	private String model;
	private int year;
	private int mileage;
	private float price;
	
	public Car(String make, String model, int year, int mileage, float price) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setMileage(mileage);
		this.setPrice(price);
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
	public int getYear() {
		return year;
	}
	/**
	 * The first car was made in 1886 therefore cannot be less than or 
	 * will short circuit
	 * @param year
	 */
	public void setYear(int year) {
		if (year < 1886) return;
		else
			this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		if (mileage < 0) return;
		else
			this.mileage = mileage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if (price < 0) return;
		else
			this.price = price;
	}
	public void printInfo() {
		System.out.println("MAKE :" + this.make + '\t'
				+ "MODEL :" + this.model + '\t'
				+ "YEAR :" + this.year + '\t'
				+ "MILEAGE :" + this.mileage + '\t'
				+ "PRICE :$" + this.price);
	}
}
