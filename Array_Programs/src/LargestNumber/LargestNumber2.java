package LargestNumber;

public class LargestNumber2 {
	public static int findlargest(int number[]) {

		int large = Integer.MIN_VALUE;

		for (int i = 0; i < number.length; i++) {
			if (large < number[i]) {
				large = number[i];
			}
		}
		return large;

	}

	public static void main(String[] args) {

		int number[] = { 12, 34, 67, 33, 55, 87, 90 };
		System.out.println("Large number is: " + findlargest(number));

	}

}
