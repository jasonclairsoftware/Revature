package dev.jason.reflections;

import java.lang.reflect.Method;

public class CatDog {

	Method catdescribe;
	Method dogdescribe;
	
	public CatDog() {
		try {
			this.catdescribe = Cat.class.getMethod("describeCat", null);
			this.dogdescribe = Dog.class.getMethod("describeDog", null);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
