package dev.jason.scopes;

public class Box {

	// Data Members
	public String owner;
	public String content;
	
	// Memory address is shared to all boxes in it's own universal scope
	public static int sides = 6;
	public static int totalBoxs = 0;
	
	// CTOR
	public Box() {
		this.owner = "John Doe";
		this.content = "Empty";
		Box.totalBoxs++;
	}
	
	public Box(String owner, String content) {
		this.owner = owner;
		this.content = content;
		Box.totalBoxs++;
	}
	
	// Methods
	public void showInfo() {
		System.out.println("Owner : " + this.owner + " content : " + this.content);
	}
	
}
