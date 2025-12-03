package LargestNumber;

public class LargestNumber1 {
	
	 
	public static int LargestNumber(int arr[]) {
		int largest=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		return largest;
	}
	

	public static void main(String[] args) {
		
		int arr[]= {1,4,6,2,9};
		
		System.out.println("Largest Number is: "+LargestNumber(arr));
		
	}

}
