package HashSet;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		
		
		HashSet set=new HashSet();
		
		set.add(10);
		set.add("hello");
		set.add(true);
		set.add(20);
		set.add("byy");
		set.add(false);
		
		System.out.println(set);
		
		
//		set.remove(1);     //x
		//set.clear();
//		set.size();
//		System.out.println(set.size());
//		
		HashSet set1=new HashSet();
		
		set1.add(30);
		set1.add("hi");
		set1.add(20);
		
		System.out.println(set1);
		
//		set.add(set1);
		set.addAll(set1);

		System.out.println(set);
		
	}

}
