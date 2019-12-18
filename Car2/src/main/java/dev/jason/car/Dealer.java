package dev.jason.car;

public class Dealer {

	private String username;
	
	public Dealer(String username) {
		this.setUsername(username);
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getusername() {
		return this.username;
	}
}
