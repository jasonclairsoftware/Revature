package dev.jason.scopes;
import java.util.ArrayList;
import java.util.List;

public class CollectionPlayground {

	public static void main(String[] args) {
		Container one = new Container("John Smith", "Rocks");
		Container two = new Container("Mark Twain", "ink");
		Container three = new Container("John Williams", "flute");
		
		Container[] containers = new Container[3];
		containers[0] = one;
		containers[1] = two;
		containers[2] = three;
		
		List<Container> containerlist = new ArrayList<Container>();
		containerlist.add(one);
		containerlist.add(two);
		containerlist.add(three);
		
		for (Container container : containerlist) 
			container.discribeContainer();
		
		
	}
}
