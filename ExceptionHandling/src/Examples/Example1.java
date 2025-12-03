package Examples;

public class Example1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
		int c = a / b;
		System.out.println("Divisible by 0");
		}catch(Exception e) {
			System.out.println(e+ "\nNot divisible by 0");
		}
		
	}

}
