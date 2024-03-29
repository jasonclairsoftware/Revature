package dev.jason.garbagecollection;

public class GarbageCollectionPlayground {

	public static void main(String[] args) {
		Book hamlet;
		{
			hamlet = new Book("HamletScript", 100);
		}
		Book tempest = new Book("Tempest", 200);

		// tempest2 is an alias for tempest and points to the
		// same memory address
		Book tempest2 = tempest;
		hamlet = null;
		//System.out.println(hamlet.getTitle()); // crash
		
		// Requests but not garenteed Java removes objects with no references
		System.gc();
	}

}
