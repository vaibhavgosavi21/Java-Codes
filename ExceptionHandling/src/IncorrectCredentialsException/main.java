package IncorrectCredentialsException;

public class main {

	public static void main(String[] args) throws IncorrectCredentialsException {
		System.out.println("Start");
		IncorrectDredential in=new IncorrectDredential("Sham", "1234");
		in.LoginAccount("Ram", "1234");
		System.out.println("End");
		
		
	}

}
