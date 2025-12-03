package LargestNumber;

import java.util.Scanner;

public class LargestNumber3 {

	public static int LargerNumber(int arr[]) {
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter elements for an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Largest Number: " + LargerNumber(arr));

	}

}
