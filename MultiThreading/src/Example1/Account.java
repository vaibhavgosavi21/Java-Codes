package Example1;

public class Account {
	private double bankbalance;

	public Account(double bankbalance) {
		this.bankbalance = bankbalance;
	}

	public synchronized void checkbalance() {
		System.out.println("Available Balance: "+this.bankbalance);
	}

	public synchronized void Withdraw(double amount) {
		if (amount <= this.bankbalance) {
			System.out.println("Withdrawing: "+amount);
			bankbalance -= amount;
			checkbalance();
			return;
		}
		System.out.println("Insufficient Amount");

	}

	public synchronized void Deposite(double amount) {
		System.out.println("Depositing: " + amount);
		this.bankbalance += amount;
		checkbalance();
	}

}
