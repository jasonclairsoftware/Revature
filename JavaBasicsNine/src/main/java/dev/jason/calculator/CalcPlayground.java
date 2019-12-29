package dev.jason.calculator;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalcPlayground {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		boolean isgoodanswer = true;
		int a, b;
		double c, d;

		do {
			try {
				System.out.println("Please give the first INTEGER to add: ");
				a = scan.nextInt();
				System.out.println("Please give the second INTEGER to add: ");
				b = scan.nextInt();
				System.out.println("Your result is " + calc.add(a, b));
				isgoodanswer = false;
			} catch (InputMismatchException e) {
				System.out.println(scan.nextLine());
				System.out.println("That is not a valid entry. Lets try this again.");
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("You must enter some value");
			}
		} while (isgoodanswer);

		isgoodanswer = true;

		do {
			try {
				System.out.println("Please give a first INTEGER to subtract: ");
				a = scan.nextInt();
				System.out.println("Please give the second INTEGER to subtract: ");
				b = scan.nextInt();
				System.out.println("Your difference is " + calc.subtract(a, b));
				isgoodanswer = false;
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("That is not a valid entry. Lets try this again.");
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("You must enter some value");
			}
		} while (isgoodanswer);

		isgoodanswer = true;

		do {
			try {
				System.out.println("Please give the first INTEGER to multiply: ");
				a = scan.nextInt();
				System.out.println("Please give the second INTEGER to multiply: ");
				b = scan.nextInt();
				System.out.println("Your product is " + calc.multiply(a, b));
				isgoodanswer = false;
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("That is not a valid entry. Lets try this again.");
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("You must enter some value");
			}
		} while (isgoodanswer);

		isgoodanswer = true;
		do {
			try {
				System.out.println("Please give the first DOUBLE to divide: ");
				c = scan.nextDouble();
				System.out.println("Please give the second DOUBLE to divide by: ");
				d = scan.nextDouble();
				double result = calc.divide(c, d);
				System.out.println("Your quotent is " + result);
				isgoodanswer = false;
			} catch (ArithmeticException e) {
				scan.nextLine();
				System.out.println("Denominator cannot be ZERO.");
			}
			catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("That is not a valid entry. Lets try this again.");
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("You must enter some value");
			}
		} while (isgoodanswer);
		scan.close();
	}

}
