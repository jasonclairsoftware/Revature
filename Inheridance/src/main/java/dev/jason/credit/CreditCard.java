package dev.jason.credit;

public abstract class CreditCard {

	private double limit;
	private String owner;
	private double balance;
	private int points;
	
	public CreditCard(double limit, String owner) {
		this.setLimit(limit);
		this.setOwner(owner);
		this.setPoints(0);
	}
	
	public CreditCard() {
		this.setOwner("NULL");
		this.setLimit(0);
		this.setPoints(0);
	}
	
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		if (limit > 0)
			this.limit = limit;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		if (points > 0) this.points = points;
	}
		
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract boolean makePurhase(double price);
	public abstract void showInfo();

	public static void greaterBalance(CreditCard c1, CreditCard c2) {
		if (c1.getBalance() == c2.getBalance())
			System.out.println("Both cards have the same balance");
		if (c1.getBalance() > c2.getBalance()) 
			System.out.println("The first card has a greater balance.");
		else
			System.out.println("The second card has a greater balance.");
		
	}

	
	
}
