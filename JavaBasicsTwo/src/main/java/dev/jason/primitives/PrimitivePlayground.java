package dev.jason.primitives;

public class PrimitivePlayground {

	public static void main(String[] args) {
		
		
		// Primitives are not objects
		// Primitives do not have a class
		// Primitives have no methods
		
		double d;		// 8 bytes
		long l;			// 8 bytes
		float f;		// 4 bytes
		int i;			// 4 bytes
		char c;			// 2 bytes
		short s;		// 2 bytes
		byte y;			// 1 byte
		boolean b;		// size unknown due to JVM
		
		NumberManipulator nM = new NumberManipulator();
		int xy = 100;
		nM.makeZeroMethod(xy);
		System.out.println(xy);
		
	}
}
