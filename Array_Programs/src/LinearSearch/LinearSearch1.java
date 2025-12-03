package LinearSearch;

public class LinearSearch1 {

	public static int Search(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// Linear Search

		int arr[] = { 2, 4, 1, 8, 10 };
		int key = 8;
		
		int index=Search(arr,key);
		if(index==-1) {
			System.out.println("Key Not Found");
		}
		else {
			System.out.println("Key found at index: "+index);
		}

	}

}
