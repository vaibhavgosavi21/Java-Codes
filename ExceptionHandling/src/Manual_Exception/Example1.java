package Manual_Exception;

public class Example1 {
	int num;
	public static void numberchecker(int num) throws NegativeNumberformatException {
		if(num<0){
			 throw new NegativeNumberformatException("Negative Number exception"+num);
		}
		else {
			System.out.println("Positive Number: "+num);
		}
	}
	

	public static void main(String[] args) {
		try {
		numberchecker(-2);
		}catch(Exception e) {
			System.out.println("Exception Catched! "+e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	
}


