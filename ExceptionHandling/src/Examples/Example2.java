package Examples;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//number
		System.out.println("Enter a value: ");
		try {
		int a=sc.nextInt();
		System.out.println(a);
		}catch(Exception e) {
			System.out.println("Invalid input type");
		}finally {
			System.out.println("Finally block");
		}
	}

}
