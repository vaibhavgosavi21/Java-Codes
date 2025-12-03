package Numbers_Program;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even number ");
		}else {
			System.out.println("Odd number");
		}

	}

}
