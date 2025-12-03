package Manual_Exception;

public class Example2 {
	
	
	 static void agechecker(int age) throws UnderageException {
		if(age<18) {
			throw new UnderageException("ur underage");
		}
		else {
			System.out.println("Now ur above 18");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		agechecker(8);
		}catch(Exception e) {
			System.out.println("Exception Catched: "+e);
		}finally {
			System.out.println("Finally exception are handled");
		}
	}

}
