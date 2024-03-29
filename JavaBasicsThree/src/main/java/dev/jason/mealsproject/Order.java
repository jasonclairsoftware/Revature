package dev.jason.mealsproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

	public final float tax = 0.03f;
	List<Meal> meals;

	public Order() {
		meals = new ArrayList<Meal>();
	}

	private void orderQuestion() {
		System.out.println("What would you like to order?");
		System.out.println("1) Nuggets");
		System.out.println("2) Burger");
		System.out.println("3) Hot Dog");
		System.out.println("4) Done Ordering");
	}

	private void setMeal(int type) {
		Meal newmeal = new Meal();
		switch (type) {
		case 1:
			newmeal.type = "Nuggets";
			newmeal.price = 1.45f;
			break;
		case 2:
			newmeal.type = "Burger";
			newmeal.price = 3.50f;
			break;
		case 3:
			newmeal.type = "HotDog";
			newmeal.price = 1.20f;
			break;
		default:
			newmeal.type = "Invalid";
			newmeal.price = 0.0f;
			break;
		}
		meals.add(newmeal);
	}

	public void askOrder() {
		Scanner scan = new Scanner(System.in);
		do {

			this.orderQuestion();
			int response = scan.nextInt();
			if (response >= 1 && response <= 3) {
				setMeal(response);
			} else if (response == 4) {
					break;
			} else {
				response = 0;
				System.out.println("That is not a valid order. Try again.");
			}
		} while (true);
		scan.close();
	}


	public void orderSummery() {

		// Print summary
		for (Meal meal : meals) {
			System.out.println("You ordered " + meal.type + " at $" + meal.price);
		}

		// get total order price
		float totalprice = 0.0f;
		for (Meal meal : meals) {
			totalprice += meal.price;
		}
		
		System.out.println("The total before tax is: $" + totalprice);
		
		// Calc tax
		totalprice += totalprice * tax;

		System.out.println("The total after tax at " + this.tax + "% is: $" + totalprice);
		System.out.println(meals.size());
	}

}
