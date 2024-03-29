package dev.jason.App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Making accounts
		Salesman lee = new Salesman("lrjenkins", "Lee Roy Jenkins", 0, 0.0f);
		Salesman anna = new Salesman("annajones", "Anna Jones", 0, 0.0f);
		Salesman william = new Salesman("welfman", "William Elfman", 0, 0.0f);

		// Making cars
		Car honda = new Car("Honda", "Civic", 2000, 200000, 300.0f);
		Car lexus = new Car("Lexis", "Eclipse", 2019, 0, 90000.00f);

		// Creating carlot
		List<Car> carlot = new ArrayList<Car>();
		carlot.add(honda);
		carlot.add(lexus);

		// Making accounts
		Map<String, Salesman> sales = new HashMap<String, Salesman>();
		sales.put(lee.getUsername(), lee);
		sales.put(anna.getUsername(), anna);
		sales.put(william.getUsername(), william);

		// login
		System.out.println("Login\nUSERNAME:");
		String username = scan.nextLine();
		Salesman user = sales.get(username); // User is now the logged in account

		// Displaying carlot
		for (Car car : carlot) {
			car.printInfo();
		}

		do {
			System.out.println("What car would you like to buy");
			int choice = Integer.parseInt(scan.nextLine());
			Car car = carlot.get(choice);
			user.sellCar(car);
			carlot.remove(choice);
			user.printStats();
			for (Car car2 : carlot) {
				car2.printInfo();
			}
		} while (true);

	}
}
