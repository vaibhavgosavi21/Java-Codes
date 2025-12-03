package ArrayList;

import java.util.ArrayList;

 
public class ArrayList1 {

	public static void main(String[] args) {
		//ArrayList
		
		ArrayList obj=new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add("hello");
		obj.add(true);
//		System.out.println(obj);
	
//		System.out.println(obj.get(2)); 		//Access elements of index 2
		
//for each loop
//		for (int i=0; i<obj.size(); i++) {
//			System.out.println(obj.get(i));
//		}
		
//Enahanced for each
//		for(Object a:obj) {
//			System.out.println(a);			
//		}
		
		
		
		System.out.println(obj);
		
//		obj.remove(1);     				//remove 1 index value
//		obj.add(2, "40");  				//add 40 at index 2
//		obj.set(1, "80"); 				//update index 1 to add 80
//		System.out.println(obj);
//		
//		obj.remove(Integer.valueOf(10));  //remove value 10 from list
//		System.out.println(obj);
		
		ArrayList obj1=new ArrayList();
		obj1.add(10);
		obj1.add(20);
		obj1.add("byee");
		obj1.add(false);
		System.out.println(obj1);

		
//		obj.add(obj1);       			// add obj1 at end
//		System.out.println(obj);

//		obj.addAll(obj1);    			// add obj and obj1 to a single list or merge
//		System.out.println(obj);
		
//		obj.addFirst(obj1);				// add obj1 at first position
//		System.out.println(obj);
	
//		obj.addLast(obj1);				// add obj1 to last position
//		System.out.println(obj);
		
//		obj.retainAll(obj1);      		// same- store and remove different
//		System.out.println(obj);

//		obj.removeAll(obj1);			// different- store & remove same
//		System.out.println(obj);
		
		
//		System.out.println(obj.reversed());
	
//		System.out.println(obj.size());		//gives size of object
		
//		System.out.println(obj.indexOf(obj1)); 		//give first index
		
//		System.out.println(obj.lastIndexOf(obj1));
	}

	

	}
