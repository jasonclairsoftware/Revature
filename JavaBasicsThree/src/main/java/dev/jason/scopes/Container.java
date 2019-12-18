package dev.jason.scopes;

public class Container {

	// Data Members
	public String owner;
	public String content;

	// Statics
	public static int totalContainers = 0;
	
	// CTOR
	public Container() {
		this.owner = "none";
		this.content = "enpty";
		Container.totalContainers++;
	}
	
	public Container(String owner, String contents) {
		this.owner = owner;
		this.content = contents;
		Container.totalContainers++;
	}
	
	public void discribeContainer() {
		System.out.println("Owner: " + this.owner + "\nContents: " + this.content + "\nTotal containers: " + Container.totalContainers);
	}
	
	public static void greeting() {
		System.out.println("All glory to the Hypno Toad!!");
	}
}
