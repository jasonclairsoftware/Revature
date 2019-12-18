package dev.jason.auction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesDatabase {
	// Data Members
	private Map<String, Salesman> salesaccounts = new HashMap<String, Salesman>();
	private Map<String, Salesman> loggedsalesaccounts = new HashMap<String, Salesman>();

	public static Scanner scan = new Scanner(System.in);
	
	// There is no error checking for duplicate usernames at this time
	// Getters and Setters
	private void addSalesAccount(Salesman salesman) {
		salesaccounts.put(salesman.getUsername(), salesman);
	}
	private Salesman getSalesAccount(String username) {
		return salesaccounts.get(username);
	}
	private Salesman getLoggedSalesman(String username) {
		return this.getLoggedSalesman(username);
	}
	private void addLoggedSalesman(Salesman salesman) {
		this.loggedsalesaccounts.put(salesman.getUsername(), salesman);
	}
	
	// Methods
	/**
	 * adds a NEW salesman to the salesaccounts MAP
	 */
	public void createNewSalesAccount() {
		System.out.println("Please enter your first name\nFIRST: ");
		String fname = SalesDatabase.scan.nextLine();
		
		System.out.println("Please enter your last name\nLAST :");
		String lname = SalesDatabase.scan.nextLine();

		System.out.println("Please enter your new username\nUSERNAME :");
		String username = SalesDatabase.scan.nextLine();
		this.getSalesAccount(username);

		Salesman salesman = new Salesman(username, fname, lname);
		this.addSalesAccount(salesman);
		
		System.out.println("Congratulations! You have SUCCSESSFULLY created a new account.");
	}


	public void loginSales() {
		System.out.println("Please enter your username to login\nUSERNAME :");

		String username = SalesDatabase.scan.next();
		Salesman sales = this.getSalesAccount(username);
		
		System.out.println(sales.getFirstName());
		
		this.addLoggedSalesman(sales);
		System.out.println("You have SUCCSESSFULLY logged in!");

	}
	

}
