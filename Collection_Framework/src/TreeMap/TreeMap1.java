package TreeMap;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
TreeMap<String, Double> map=new TreeMap<String, Double>();
		
		map.put("Rahul", 89.90);
		map.put("Rohit", 95.89);
		map.put("Govind", 90.21);
		map.put("abC", 88.88);
		map.put("abc", 88.88);
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		
		System.out.println(map.isEmpty());				// return true or false
		System.out.println(map.containsKey("Rohit"));  	// return true or false
		System.out.println(map.containsValue(88.88));   // return true or false
		System.out.println(map.entrySet());    			//return set
		System.out.println(map.get("Govind"));
		
		
		map.forEach((key, val)->System.out.println("Key: "+key+", value: "+val));


	}

}
