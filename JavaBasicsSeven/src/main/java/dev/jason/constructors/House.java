package dev.jason.constructors;

public class House extends Dwelling{

	private int totwalls;
	
	public House() {
		
		this.setTotWalls(4);
		
	}
	
	public House(int area) {
		super(area);
		this.setTotWalls(4);
	}
	
	public House(int area, int totwalls) {
		super(area);
		this.setTotWalls(totwalls);
	}
	
	public House(int area, int totwalls, String owner) {
		super(area, owner);
		this.setTotWalls(totwalls);
	}
	
	public int getTotWalls() {
		return this.totwalls;
	}
	/**
	 * must have at least 3 walls
	 * @param totwalls
	 */
	public void setTotWalls(int totwalls) {
		if (totwalls < 3) return;
		this.totwalls = totwalls;
	}
	
	@Override
	public String toString() {
		String holder = super.getOwner() + '\t' + super.toString() + "\tTOTWALLS :" + this.getTotWalls();
		return holder;
		
	}
	
	
}
