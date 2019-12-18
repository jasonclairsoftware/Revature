package dev.jason.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsPlayground {

	public static void main(String[] args) {
		Map<String, Account> accounts = new HashMap<String, Account>();
		Account jason = new Account("jasonclairgamedev@gmail.com", 4078488456L, "Jason", "Clair", "yolhan");
		Account mike  = new Account("mikey@yahoo.com", 6028485214L, "Mike", "Baldwin", "wiggles");
		
		accounts.put(jason.getEmail(), jason);
		accounts.put(mike.getEmail(), mike);
		
		System.out.println(accounts.get("jasonclairgamedev@gmail.com").getPhonenumber());
		
		
		// Created set
		Set<Account> setgoodies = new HashSet<Account>();
		
		// Loaded set
		setgoodies.add(jason);
		setgoodies.add(mike);
		
		// accessing sets getters
		for (Account accountasdf : setgoodies) {
			System.out.println(accountasdf.getFname());		
			}
	}
}
