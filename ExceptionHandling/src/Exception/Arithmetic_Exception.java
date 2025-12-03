package Exception;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			int a=10/0;
			System.out.println(a);
		}catch(Exception obj){
			System.out.println(obj);
			System.out.println("Main end");

		}
		

	}

}

