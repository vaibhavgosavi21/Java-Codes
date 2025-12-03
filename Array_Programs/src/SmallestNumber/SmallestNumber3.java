package SmallestNumber;

import java.util.Arrays;

public class SmallestNumber3 {

	public static void main(String[] args) {

		int arr[] = { 11, 44, 3, 2, 44, 5 };
		
		int small=Arrays.stream(arr).min().getAsInt();
		System.out.println("Smallest number is : "+small);
		
	
	}

}
