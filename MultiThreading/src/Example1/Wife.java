package Example1;

public class Wife extends Thread{
	private Account account;
	
	public Wife(Account acc) {
		this.account=acc;
	}
	
	@Override
	public void run() {
		account.Withdraw(14500);
		account.Deposite(100);
	}

}
