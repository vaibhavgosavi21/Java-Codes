package Numbers_Program;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int org_num = num; // store original number to orng_num

		int rev = 0; // store reverse number

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if(org_num==rev) {
			System.out.println(org_num+" is Palindrome number");
		}else {
			System.out.println(org_num+" is not palindrome number");
		}

	}

}
