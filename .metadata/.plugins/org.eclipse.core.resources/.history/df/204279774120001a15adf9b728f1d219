package dev.jason.auction;
/*
 - You are tasked with making an application for a car dealership.
 
	1) Salesmen should be able to "login" using their username into the system
	
	2) There should be a way to see all cars available to be sold

	3) Cars should show make model year mileage and value
		fields should be properly encapuslated to prevent wrong values

	4) A salesman should be able to sell a car which adds to a salesman stats

	5) Each salesman should have a field that keeps track of cars sold
		and total value of cars sold.

	6) bonus* keep a record of specific cars sold by each salesman
*/
public class App {

	public static void main(String[] args) {
	
		SalesDatabase salesdb = new SalesDatabase();	// New auction obj
		CarLot carlot = new CarLot();
		boolean isRunning = true;
		
		
		// main program loop
		do {
			System.out.println("Welcome to L R Jenkins Car Lot\nPlease select an option");
			System.out.println("1) Create account"
					+ "\n2) Login to account"
					+ "\n3) Add car to lot"
					+ "\n4) View inventory"
					+ "\n5) Sell Car"
					+ "\n6) Exit");
			int choice = Integer.parseInt(SalesDatabase.scan.nextLine());
			switch (choice) {
			case 1: salesdb.createNewSalesAccount(); break;
			case 2: salesdb.loginSales(); break;
			case 3: carlot.addCar(); break;
			case 4: carlot.showInventory(); break;
			case 5: // TODO:: Sell car
			case 6: isRunning = false; break;
			default:
				System.out.println("That is not a valid option\nPlease try again.");
				break;
			}
		} while (isRunning);
		
		
		
		
		
		SalesDatabase.scan.close();
	}
}
