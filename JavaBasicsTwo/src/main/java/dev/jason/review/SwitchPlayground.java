package dev.jason.review;

public class SwitchPlayground {

	public static void main(String[] args) {
		int x = 0;
		
		switch (x) {
		case 1:
			System.out.println("You are in the first case.");
			break;
		case 2:
			System.out.println("You are in the second case.");
			break;
		case 3:
			System.out.println("You are in the third case.");
			break;
		default:
			System.out.println("You are in the default case.");
			break;
		}
		
		char c = '@' + '"';
		System.out.println((int)c);
		
		
		
	}
}
