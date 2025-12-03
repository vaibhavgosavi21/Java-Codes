package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class OperationBetweenTwoList {
	public static void main(String[] args) {

		ArrayList list1=new ArrayList<>();
		
		list1.add(2);
		list1.add('a');
		list1.add(7);
		list1.add(3);
		list1.add(1);
		System.out.println(list1);
		
		
		
		ArrayList list2=new ArrayList<>();
		
		list2.add(2);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2);
		
		//List2 merge into list1 at the end position
//		list1.add(list2);
//		System.out.println(list1);
		
		//List1 add all elements from list2 to list1
		list1.addAll(list2);
		System.out.println(list1);
		
		//List2 merge into list1 at the first index 
		list1.addFirst(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		//Remove same value and store different value
//		System.out.println("Removeall:");	
//		list1.removeAll(list2); 
//		System.out.println(list1);
		
		//Remove different value and store same value
		System.out.println("RetailAll:");
		list1.retainAll(list2);
		System.out.println(list1);
		
		//Reversed : convert into reverse order
		System.out.println("Reversed: ");
		System.out.println(list1.reversed());
		
		
	}
}
