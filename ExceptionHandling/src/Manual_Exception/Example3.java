package Manual_Exception;

public class Example3 {
	static void checkodd(int num) throws NotOdd{
		if(num%2==0){
			System.out.println("Number is Odd");
		}else {
			throw new NotOdd("Number is not  odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		checkodd(11);
		}catch(Exception e) {
			System.out.println("Ecxception catched: "+e);
		}finally {
			System.out.println("Finally exception handling are done!");
		}
		

	}

}
