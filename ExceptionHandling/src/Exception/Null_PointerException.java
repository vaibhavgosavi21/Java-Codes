package Exception;

public class Null_PointerException {


	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
		
		System.out.println(e);
		System.out.println("Welcome");;

		}
	}

}
