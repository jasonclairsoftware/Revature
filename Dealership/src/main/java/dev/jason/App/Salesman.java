package dev.jason.App;

import java.util.ArrayList;
import java.util.List;

public class Salesman {


	private String username;
	private String name;
	private int totalcarssold;
	private float revenue;
	private List<Car> carsold = new ArrayList<Car>();
	
	public Salesman(String username, String name, int totalcarssold, float revenue) {
		this.username = username;
		this.name = name;
		this.totalcarssold = totalcarssold;
		this.revenue = revenue;
	}	
	public List<Car> getCarsold() {
		return carsold;
	}
	public void setCarsold(List<Car> carsold) {
		this.carsold = carsold;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalcarssold() {
		return totalcarssold;
	}
	public void setTotalcarssold(int totalcarssold) {
		this.totalcarssold = totalcarssold;
	}
	public float getRevenue() {
		return revenue;
	}
	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
	public void sellCar(Car car) {
		this.revenue += car.getPrice();
		this.totalcarssold++;
		this.carsold.add(car);
	}
	public void printStats() {
		System.out.println("USERNAME :" + this.username + '\t'
				+ "NAME :" + this.name + '\t'
				+ "CARS SOLD :" + this.totalcarssold + '\t'
				+ "REVENUE :$" + this.revenue + '\t');
	}
}
