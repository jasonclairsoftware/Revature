package dev.jason.scanners;

import java.util.Scanner;

public class ScannerPlayground {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("give me a num to mult: ");
		int x = scan.nextInt();
		
		System.out.println("The power of " + x + " is " + (x*x));
		scan.close();
	}
}
