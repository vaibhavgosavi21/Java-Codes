package SmallestNumber;

public class SmallestNumber1 {

	public static int findSmallest(int array[]) {
		int small = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (small > array[i]) {
				small = array[i];
			}
		}
		return small;

	}

	public static void main(String[] args) {
		int array[] = { 2, 4, 8, 1, 4, 0, 35 };

		System.out.println(findSmallest(array));
	}

}
