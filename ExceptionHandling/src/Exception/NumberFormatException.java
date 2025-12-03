package Exception;

public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("One");
		try {
			String s = "abc";
			int n = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("two");
		}

	}

}
