package Account;

public class Account {
	
	private int acccno ;
	private double bankbalance;
	public Account(int acccno, double bankbalance) {
		super();
		this.acccno = acccno;
		this.bankbalance = bankbalance;
	}
	
	

	public int getAcccno() {
		return acccno;
	}



	public void setAcccno(int acccno) {
		this.acccno = acccno;
	}



	public double getBankbalance() {
		return bankbalance;
	}



	public void setBankbalance(double bankbalance) {
		this.bankbalance = bankbalance;
	}



	public void withdraw(double amount) {
		if(amount<this.bankbalance) {
			System.out.println(amount+"Withdrawn successfully...");
			this.bankbalance-=amount;
			System.out.println("Availbale Balance: "+this.bankbalance);
		}else {
			throw new ArithmeticException("Insufficient Balance");
		}
	}
	
	

}
