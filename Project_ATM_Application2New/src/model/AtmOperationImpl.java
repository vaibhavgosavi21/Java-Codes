package model;

import java.util.Scanner;

public class AtmOperationImpl implements ATMOperation {
	Scanner sc = new Scanner(System.in);

	@Override
	public void deposit(Account account, double amount, String pin) {
		if (account == null || pin == null) {
			System.out.println("Invalid input! Deposit Failed.");
			return;
		}
		if (!account.getPin().equals(pin)) {
			System.out.println("Invalid PIN! Deposit Failed.");
			return;
		}
		if (amount <= 0) {
			System.out.println("Invalid amount! Please enter positive amount.");
			return;
		}
		account.setBalance(account.getBalance() + amount);
		Transaction t = new Transaction("Deposit", amount, account.getBalance());
		account.getHistory().addTransaction(t);
		TransactionDAO.saveTransaction(account.getAccId(), "Deposit", amount, account.getBalance());
		TransactionDAO.updateAccountBalance(account.getAccId(), account.getBalance());
		System.out.println("Amount Deposited: " + amount);
	}

	@Override
	public void withdraw(Account account, double amount, String pin, boolean printReceipt) {
		if (account == null || pin == null) {
			System.out.println("Invalid input! Withdrawal Failed.");
			return;
		}
		if (!account.getPin().equals(pin)) {
			System.out.println("Invalid PIN! Withdrawal Failed.");
			return;
		}
		if (amount <= 0) {
			System.out.println("Invalid amount! Please enter positive amount.");
			return;
		}
		if (account.getAccountType().equalsIgnoreCase("Saving") && amount > 500000) {
			System.out.println("Withdrawal limit exceeded (Max 5 Lac for Saving).");
			return;
		}
		if (amount > account.getBalance()) {
			System.out.println("Insufficient Balance!");
			return;
		}
		account.setBalance(account.getBalance() - amount);
		Transaction t = new Transaction("Withdraw", amount, account.getBalance());
		account.getHistory().addTransaction(t);
		TransactionDAO.saveTransaction(account.getAccId(), "Withdraw", amount, account.getBalance());
		TransactionDAO.updateAccountBalance(account.getAccId(), account.getBalance());
		System.out.println("Withdrawal Successful: " + amount);
		if (printReceipt)
			System.out.println(t);
	}

	@Override
	public void balanceEnquiry(Account account, String pin, boolean printReceipt) {
		if (account == null || pin == null) {
			System.out.println("Invalid input!");
			return;
		}
		if (account.getPin().equals(pin)) {
			System.out.println("Available Balance: " + account.getBalance());
			Transaction t = new Transaction("Balance Enquiry", 0, account.getBalance());
			account.getHistory().addTransaction(t);
			TransactionDAO.saveTransaction(account.getAccId(), "Balance Enquiry", 0, account.getBalance());
			if (printReceipt)
				System.out.println(t);

		} else {
			System.out.println("Invalid PIN!");
		}
	}

	@Override
	public void generateOrUpdatePin(Account account, String oldPin) {
		if (account == null || oldPin == null) {
			System.out.println("Invalid input!");
			return;
		}
		if (oldPin.equals(account.getPin())) {
			System.out.print("Enter New PIN (4 digits): ");
			String newPin = sc.next();
			if (newPin.length() != 4 || !newPin.matches("\\d{4}")) {
				System.out.println("PIN must be 4 digits!");
				return;
			}
			account.setPin(newPin);
			TransactionDAO.updateAccountPin(account.getAccId(), newPin);
			System.out.print("Enter OTP: ");
			String otp = sc.next();
			System.out.println("PIN Updated Successfully!");
		} else {
			System.out.println("Wrong PIN! Please Enter Correct PIN");
		}
	}

	@Override
	public void showTransactionHistory(Account account, String pin) {
		if (account.getPin().equals(pin)) {
			TransactionDAO.showHistory(account.getAccId());
		} else {
			System.out.println("Invalid PIN! Cannot show history.");
		}
	}
}
