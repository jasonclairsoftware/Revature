package dev.jason.scopes;

public class BoxPlayground {

	public static void main(String[] args) {
		Box a = new Box("Jason", "Puppies");
		Box b = new Box("Phylicia", "kittens");
		//Box c;// = b;
		
		System.out.println(Box.totalBoxs);
	}
}
