package dev.jason.inheritance;
// Inheritance exercise
// 1) make a new class and paste by main method into it
//		This is going to serve as battery code (test code)

// 2) Make at least three more classes AsteralBody, Planet, and Moon
// 		I should not be able to make an instance/object of AsteralBody

// 3) In AsteralBody there should be 2 fields 
//		A String to hold the type of climate
//		and an int that keeps a count of total asteral bodies in the solar system

// 4) There should be a method in AsteralBody called bodyBehavior that prints the climate
//		both Moon and Planet should display something different by overriding AsteralBodies method

// 5) In the constructors of both Moon and Planet should increment the totPlanets
//		from AsteralBody's field

public class BatteryCode {

	public static void main(String[] args) {
		
		// AstralBody ab= new AstralBody();		// This should not be able to work
		Planet earth = new Planet("Temperate");
		Moon moon = new Moon("Dead");
		
		earth.bodyBehavior();
		moon.bodyBehavior();
		
		System.out.println("TOTAL PLANETS :" + AsteralBody.totplanets);
		
		if (AsteralBody.totplanets == 2) {
			System.out.println("Great! You made totplanets a static field correctly!");
		}
		
	}
}
