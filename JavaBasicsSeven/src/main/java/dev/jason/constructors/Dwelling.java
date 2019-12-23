package dev.jason.constructors;

public class Dwelling {

	private int area;
	private String owner;
	
	public Dwelling(int area) {
		this.setArea(area);
		System.out.println("Building Dwelling with the size of " + this.getArea());
		
	}
	public Dwelling() {
		this.setArea(100);
		System.out.println("Defaulting to size " + this.getArea());
	}
	public Dwelling(int area, String owner) {
		this.setArea(area);
		this.setOwner(owner);
		System.out.println("Built Dwelling with the size of " + this.getArea() + " Owned by " + this.getOwner());
		
	}
	
	void setArea(int area) {
		this.area = area;
	}
	public int getArea() {
		return this.area;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		String printable = "AREA :" + this.getArea();
		return printable;
	}
	
	
}
