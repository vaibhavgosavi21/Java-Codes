package LinearSearch;

public class LinearSearch2 {
	
	public static int SearckKey(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
	
		int arr[]= {112,213,211,123,433};
		int key=433;
		
		SearckKey(arr,key);
		
		int found=SearckKey(arr,key);
		
		if(found==-1) {
			System.out.println("Key not found");
		}
		System.out.println("Key found at index "+found);

	}

	
}
