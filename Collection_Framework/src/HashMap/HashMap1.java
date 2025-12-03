package HashMap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, Double> map=new HashMap<String, Double>();
		
		map.put("Rahul", 89.90);
		map.put("Rohit", 95.89);
		map.put("Govind", 90.21);
		map.put("abc", 88.88);
		map.put("abc", 88.88);
		
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		
		System.out.println(map.isEmpty());				// return true or false
		System.out.println(map.containsKey("Rohit"));  	// return true or false
		System.out.println(map.containsValue(88.88));   // return true or false
		System.out.println(map.entrySet());    			//return set
		System.out.println(map.get("Govind")); 			//return value

		map.forEach((key, val)->System.out.println("Key: "+key+", value: "+val));
		
		//iterate ways(3)
		
		
		map.remove("abc");
		System.out.println(map);
	}

}
