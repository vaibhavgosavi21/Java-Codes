package TreeSet;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set=new TreeSet();
		
		set.add("a");
		set.add("Hello");
		set.add("b");
		set.add("java");
		System.out.println(set);
		
//		set.remove(1);
		set.removeFirst();
		set.removeAll(set);
		System.out.println(set);
		
		
		TreeSet set1=new TreeSet();
		set1.add("hi");
		set1.add("Car");
		System.out.println(set1);
		
		
		set.addAll(set1);
		System.out.println(set);

		
	}

}
