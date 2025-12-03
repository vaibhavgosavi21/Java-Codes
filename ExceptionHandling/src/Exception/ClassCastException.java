package Exception;

public class ClassCastException {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
		Object obj = new String("Hello");
        Integer num = (Integer) obj;
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Continue...");
		}
	}

}
