package dev.jason.auction;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CarLot {
	// Container of cars in lot
	private Set<Car> cars;
	
	public CarLot() {
		cars = new HashSet<Car>();
	}
	
	public void addCar(Car car) { 
		cars.add(car);
	}
	/**
	 * asks to create a new car and load it into the carlot
	 */
	public void addCar() {
		System.out.println("What is the make of the car\nMAKE: ");
		String make = SalesDatabase.scan.nextLine();
		System.out.println("What is the model of the car\nMODEL :");
		String model = SalesDatabase.scan.nextLine();
		System.out.println("What year was the car manufactured\nYEAR :");
		short year = Short.parseShort(SalesDatabase.scan.nextLine());
		System.out.println("What is the mileage of the car\nMILEAGE :");
		int mileage = Integer.parseInt(SalesDatabase.scan.nextLine());
		System.out.println("What is the price of the car\nPRICE :");
		float price = Float.parseFloat(SalesDatabase.scan.nextLine());
		
		Car car = new Car(make, model, year, mileage, price);
		cars.add(car);

	}
	public void showInventory() {
		for (Car car : cars) car.printInfo();
	}
}