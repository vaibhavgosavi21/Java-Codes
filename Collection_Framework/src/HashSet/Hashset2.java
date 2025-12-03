package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Hashset2 {
	public static void main(String[] args) {
		
		//does not follow insertion order
		//sorted automatically
		
		
		Set set=new HashSet();
		set.add(12);
		set.add(10);
		set.add(20);
		set.add('a');
		set.add(true);
		set.add(11.11);
		set.add("Hello");
		System.out.println(set);
		set.add(10);
		
	}

}
