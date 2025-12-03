package LinearSearch;

import java.util.Scanner;

public class LinearSearch3 {
	
	//Linear search using user input

	public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
		int[] arr=new int[5];
		
		System.out.println("Enter elements for array: ");
		for(int i=0; i<arr.length; i++) {
			 arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter key to searh: ");
		int key=sc.nextInt();
		
		boolean found=false;
		
		for(int i=0; i<arr.length; i++) {
			if(key==arr[i]) {
				System.out.println("Key is found at index "+arr[i]);
				found=true;
			}

		}
		if(!found) {
		System.out.println("Key not found");
	}

}

}
