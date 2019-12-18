package dev.jason.auction;

public class Salesman {

	// Data Members
	private String username;
	private String fname;
	private String lname;
	private float moneymade;
	
	// CTOR
	public Salesman(String username, String fname, String lname) {
		this.setUsername(username);
		this.setFirstName(fname);
		this.setLastName(lname);
		this.moneymade = 0.0f;
	}
	
	// Getter and Setters
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return this.fname;
	}
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	public String getLastName() {
		return this.lname;
	}
	public void setLastName(String lname) {
		this.lname = lname;
	}
	public float getMoneyMade() {
		return this.moneymade;
	}
	private void addMoneyMade(float moneymade) {
		if (moneymade < 0.0f) 	
			return;
		else 
			this.moneymade += moneymade;
	}
	// TODO:: sellcar method

}
