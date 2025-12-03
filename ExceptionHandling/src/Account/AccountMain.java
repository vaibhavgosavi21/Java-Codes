package Account;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("Start");
		Account a=new Account (2332542, 200);
		try {
		a.withdraw(2000);
		}catch (Exception e) {
		}
		System.out.println("End");
		System.out.println(a.getBankbalance());
	}

}
