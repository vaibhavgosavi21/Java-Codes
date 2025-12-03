package LargestNumber;

import java.util.Arrays;

public class LargestNumber4_usingStreammethod {

	public static void main(String[] args) {

		int arr[]= {23,12,34,21,55,11,2};
		
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("Max no: "+max);
	}

}
