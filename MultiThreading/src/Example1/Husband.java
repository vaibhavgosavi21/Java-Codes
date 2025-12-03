package Example1;

public class Husband extends Thread{
	private Account account;
	
	public Husband(Account acc) {
		this.account=acc;
	}
	
	@Override
	public void run() {
		account.Deposite(10000);
		account.Withdraw(500);
	}
	
	

}
