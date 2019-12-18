package dev.jason.control;

// Classes are Pascal case
public class ControlFlow {

	// This is the point of entry
	public static void main(String[] args ) {
		
		// code here
		ifStatment();
		logicOperators();
		// more code here

	}
	
	public static void ifStatment() {
		if (true) 		System.out.println("This statment will always print out...");
		if (true) 		System.out.println("This statment is second");
		if (true) 		System.out.println("This statment is third");
		if (true) 		System.out.println("is forth");
		if (false)		System.out.println("This will never print");
	}
	
	public static void logicOperators() {
		// Local data members
		int a=1, b=2, c=3;
		int x=1, y=20, z=30;
		

		/*//////////////////////////
		 *   if statements
		 */////////////////////////
		
		// Logical operators
		if (x>y && a<y || b>20) 		System.out.println("Yes I will print");
		else 							System.out.println("I will print out if failed if statment.");
		
		// equality operators
		if (a == x)						System.out.println("a is equal to x");
		if (a != x)						System.out.println("a is NOT equal to x");
		if (a >= 1)						System.out.println("a is greater or equal to 5");
		if (a > 5 || a == 5)			System.out.println("this is another way of doing above");
		
		
	}
}
