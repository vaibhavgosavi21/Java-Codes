package LinearSearch;

import java.util.Scanner;

public class LinearSearch4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Linear search of String array using user input
		
		 String [] arr=new String[5];
		
		System.out.println("Enter some String value for an array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.next();
		}
		
		System.out.println("Enter a Search key for a array: ");
		String key=sc.next();
		
		
		boolean found=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(key)) {
				System.out.println("Key is found at index "+i);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Key "+key +" not Found...");
		}

	}

}
