package LinearSearch;

public class LinearSearch_String {
	
	
	public static int linearSearch(String Fruit[], String key) {
		for(int i=0; i<Fruit.length; i++) {
			if(Fruit[i].equals(key)) {
				System.out.println("Key "+key+" is found at index "+i);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// Linear search for String type array
		
		String Fruit[]= {"mango","orange","apple","grapes","banana"};
		String key="grapes";
		
		 int index=linearSearch(Fruit, key);
		if(index==-1) {
			System.out.println("Key not found");
		}
			
		}
		
		
		

	}


