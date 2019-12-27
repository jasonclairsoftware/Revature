package dev.jason.excemptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcemptionPlayground {

	public static void main(String[] args) {

		System.out.println("Welcome to my secret underground layer.");
		Scanner scan = new Scanner(System.in);
		try {

			int x = scan.nextInt();
			System.out.println("Enternumber to divide by: ");
			int y = scan.nextInt();
			System.out.println(x / y);

		} catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("Cannot divide by ZERO");

		} catch (InputMismatchException e) {

			e.printStackTrace();
			System.out.println("You must input an INTEGER");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("You gone done broke a thing god only knows");
		}

		scan.close();

	}
}
