package Examples;

import java.util.Scanner;

public class Example3 { 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value: ");
		try {
		byte a=sc.nextByte();
		System.out.println(a);
		}catch(Exception e) {
			System.out.println(e+"\ninvalid value for container");
		}
		finally {
			System.out.println("Finally block");
		}
		
		
	}

}
