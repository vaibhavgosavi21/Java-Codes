package SmallestNumber;

import java.util.Scanner;

public class SmallestNumber2 {
	public static int SmallestNumber(int arr[]) {
		int small = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		return small;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter elemnts for an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Smallest Number is: "+SmallestNumber(arr));

	}

}
