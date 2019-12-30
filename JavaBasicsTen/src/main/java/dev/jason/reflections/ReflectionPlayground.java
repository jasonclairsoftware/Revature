package dev.jason.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPlayground {

	public static void main(String[] args) {
		
		
		// Reflection is an almost all powerful tool in Java
		// It allows Java to read and edit itself as it runs
		
		Method dogmethod;
		try {
			dogmethod = Dog.class.getMethod("describeDog", null);
			dogmethod.invoke(null, null);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CatDog catdog = new CatDog();
		try {
			catdog.catdescribe.invoke(null, null);
			catdog.dogdescribe.invoke(null, null);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
