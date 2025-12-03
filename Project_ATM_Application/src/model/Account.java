package model;

public class Account {
    private String accountNumber;   
    private String accountHolderName;
    private double balance;
    private String accountType;      
    private String mobileNumber;
    private String pin;
    private TransactionHistory history; 
    private String accountPass;
    private String accId;

    //constructors
    public Account(String accId, String accountNumber, String accountHolderName,
                   double balance, String accountType,
                   String mobileNumber, String pin,String accountPass) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.mobileNumber = mobileNumber;
        this.pin = pin;
        this.accountPass=accountPass;
        this.history = new TransactionHistory(); // initialize
    }

    // Getters & Setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public TransactionHistory getHistory() {
		return history;
	}

	public void setHistory(TransactionHistory history) {
		this.history = history;
	}

	public String getAccountPass() {
		return accountPass;
	}

	public void setAccountPass(String accountPass) {
		this.accountPass = accountPass;
	}

	
    

}
