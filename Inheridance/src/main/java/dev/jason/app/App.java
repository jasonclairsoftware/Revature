package dev.jason.app;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//Animal voidro = new Animal();
		//Animal slytherin = new Animal("snake");
		Cat kitty = new Cat("Black Short Haired");
		Dog doggo = new Dog("Husky");
		Dog axel = new Dog("German Shepard");
		
		// Parent class
//		voidro.cry();
//		slytherin.cry();
		
		//Derived class
		kitty.cry();
		kitty.landPurrfectly();
		
		doggo.cry();
		doggo.dig();
		
//		voidro.discribeSelf();
//		slytherin.discribeSelf();
		kitty.discribeSelf();
		doggo.discribeSelf();
		
		//Animal ani = doggo;
		
		List<Animal> animals = new ArrayList<Animal>();
//		animals.add(slytherin);
		animals.add(kitty);
		animals.add(doggo);
		animals.add(axel);
		
		for (Animal congoodies : animals) {
			congoodies.discribeSelf();
			
			if (congoodies instanceof Cat) System.out.println("I'm a kitty..");
		}

		
	
	}
}
