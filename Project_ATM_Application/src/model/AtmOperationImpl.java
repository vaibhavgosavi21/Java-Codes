package model;

import java.util.Scanner;

public class AtmOperationImpl implements ATMOperation {
	Scanner sc = new Scanner(System.in);
	senderacc sacc;

	@Override
	public void deposit(Account account, double amount, String pin) {
		if (account.getPin().equals(pin)) {
			account.setBalance(account.getBalance() + amount);
			Transaction t = new Transaction("Deposit", amount, account.getBalance());
			account.getHistory().addTransaction(t); // save in history
			System.out.println("Amount Deposited: " + amount);
		} else {
			System.out.println("Invalid PIN! Deposit Failed.");
		}
	}

	@Override
	public void withdraw(Account account, double amount, String pin, boolean printReceipt) {
		if (!account.getPin().equals(pin)) {
			System.out.println("Invalid PIN! Withdrawal Failed.");
			return;
		}

		if (account.getAccountType().equalsIgnoreCase("Saving") && amount > 500000) {
			System.out.println("Withdrawal limit exceeded (Max 5 Lac for Saving).");
			return;
		}

		if (amount <= account.getBalance()) {
			account.setBalance(account.getBalance() - amount);
			Transaction t = new Transaction("Withdraw", amount, account.getBalance());
			account.getHistory().addTransaction(t); // save in history
			System.out.println("Withdrawal Successful: " + amount);
			if (printReceipt)
				System.out.println(t);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	@Override
	public void balanceEnquiry(Account account, String pin, boolean printReceipt) {
		if (account.getPin().equals(pin)) {
			System.out.println("Available Balance: " + account.getBalance());
			Transaction t = new Transaction("Balance Enquiry", 0, account.getBalance());
			account.getHistory().addTransaction(t); // save in history
			if (printReceipt)
				System.out.println(t);

		} else {
			System.out.println("Invalid PIN!");
		}
	}

	@Override
	public void generateOrUpdatePin(Account account, String Oldpin) {
		if (Oldpin.equals(account.getPin())) {
			System.out.println("Enter New Pin: ");
			String NewPin = sc.next();
			account.setPin(NewPin);
			System.out.println("Enter OTP: ");// OTP assumed correct
			String Otp = sc.next();
			System.out.println("PIN Updated Successfully!");
		} else {
			System.out.println("Wrong Pin! Plese Enter Corrext Pin");
		}

	}

	@Override
	public void showTransactionHistory(Account account, String pin) {
		if (account.getPin().equals(pin)) {
			account.getHistory().printHistory();
		} else {
			System.out.println("Invalid PIN! Cannot show history.");
		}
	}

	@Override
	public void generateOrUpdatePin(Account account, String newPin, String otp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void AccountoAccountTranser(Account account, String senderacc, String receiveracc, double amount) {
		if (senderacc.equals(account.getAccountNumber()) && receiveracc.equals(account.getAccountNumber())) {
			if(!senderacc.equals(receiveracc)) {
			if (amount > account.getBalance()) {
				System.out.println("Insufficient Balanace....");
			} else {
				account.setBalance(account.getBalance() - amount);
				account.setBalance(account.getBalance()+amount);
				Transaction t = new Transaction("BankTransfer", amount, account.getBalance());
				account.getHistory().addTransaction(t); // save in history
				System.out.println(amount + " RS Transferred Successfully");
			}
			}
		}else {
			System.out.println("Invalid Account Number");
		}

	}
}
