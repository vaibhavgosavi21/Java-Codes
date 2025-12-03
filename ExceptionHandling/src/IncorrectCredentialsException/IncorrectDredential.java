package IncorrectCredentialsException;

public class IncorrectDredential {
	private static  String username;
	private  static String password;
	
	
	
	public IncorrectDredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public void LoginAccount(String user, String pass) throws IncorrectCredentialsException
	{
		if(user.equals(username)&&pass.equals(password)) {
			System.out.println("Login Successfully");
		}else {
			throw new IncorrectCredentialsException("Account detials do not match...");
			}
	}

}
