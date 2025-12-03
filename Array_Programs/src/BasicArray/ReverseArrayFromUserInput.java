package BasicArray;

import java.util.Scanner;

public class ReverseArrayFromUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter size of array: ");
         n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		 for(int i=arr.length-1; i>=0; i--) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();

	}

}
