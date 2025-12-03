package ArrayList;

import java.util.ArrayList;

public class Operation {
	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();

		// Add element by value
		System.out.println("Add by value");
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println(list);

		
		// Add element by index
		System.out.println("Add by index");
		list.add(2, 3);
		list.add(4, 90);
		System.out.println(list);

		
		// Remove element by index
		System.out.println("Remove by index: ");
		list.remove(2);
		System.out.println(list);
		
		
		// Remove by elements by value
		System.out.println("Remove by value: ");
		list.remove(Integer.valueOf(90));
		System.out.println(list);

		
		// Get Element by index
		System.out.println("Get element by index");
		System.out.println(list.get(2));
		System.out.println(list.get(0));
		
		//Set elements at index
		System.out.println("Set elements at index:");
		list.set(2, 3);
		System.out.println(list);
		
		//Contains : check availability of index true/false
		System.out.println("Contains:");
		System.out.println(list.contains(3));
		System.out.println(list.contains(90));
		System.out.println(list.containsAll(list));
		
	}

}
