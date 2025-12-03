package Examples;

public class Example4 {
	public static void main(String[] args) {
		String s=null;
		try {
		System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e+"Catch block");
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
