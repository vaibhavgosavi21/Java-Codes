package model;

import java.util.Scanner;

public class ATMMain {
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AtmOperationImpl atm = new AtmOperationImpl();

		// accounts
		//							accno				name			balance	acctype		mobileno		pin		username
		Account acc1 = new Account("101","847583944389", "Vaibhav Gosavi", 10000, "Saving", "9876543210", "1234","Vaibhav@11");
		Account acc2 = new Account("102","236456932234", "Abhishek Anap", 25000, "Current", "9123456780", "5678", "Abhi@21");
		Account acc3 = new Account("103","081243223434", "Nikhil Shinde", 60000, "Saving", "9087563456", "9011","Nikhil@31");

		
		System.out.println("		===== ATM System =====		");
		System.out.print("Enter Account passkey: ");
		String accpassword = sc.next();

		// Validation
		Account activeAccount = null;
		if (accpassword.equals(acc1.getAccountPass())) {
			activeAccount = acc1;
		} else if (accpassword.equals(acc2.getAccountPass())) {
			activeAccount = acc2;
		} else if (accpassword.equals(acc3.getAccountPass())) {
			activeAccount = acc3;
		} else {
			System.out.println(" Invalid Password! Exiting...");
			System.exit(0);
		}

		System.out.println("\nWelcome " + activeAccount.getAccountHolderName());

		while (true) {
			System.out.println("\n		===== ATM System =====		");
			System.out.println("1. Deposit				4. Generate/Update PIN");
			System.out.println("2. Withdraw				5. Show Transaction History");
			System.out.println("3. Balance Enquiry			6. Account to Account Transfer");
			System.out.println("7. Exist");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			
			case 1 -> { // Deposite
				System.out.print("Enter Amount to Deposit: ");
				double depAmt = sc.nextDouble();
				System.out.print("Enter PIN: ");
				String depPin = sc.next();
				atm.deposit(activeAccount, depAmt, depPin);
			}

			case 2 -> { // Withdraw
				System.out.print("Enter Amount to Withdraw: ");
				double withAmt = sc.nextDouble();
				System.out.print("Enter PIN: ");
				String withPin = sc.next();
				System.out.print("Print Receipt? (true/false): ");
				boolean receipt = sc.nextBoolean();
				atm.withdraw(activeAccount, withAmt, withPin, receipt);

			}

			case 3 -> { // Balance Enquiry
				System.out.print("Enter PIN: ");
				String balPin = sc.next();
				System.out.print("Print Receipt? (true/false): ");
				boolean balReceipt = sc.nextBoolean();
				atm.balanceEnquiry(activeAccount, balPin, balReceipt);

			}

			case 4 -> { //
				System.out.println("Enter your Old pin : ");
				String oldpin = sc.next();
				atm.generateOrUpdatePin(activeAccount, oldpin);
			}

			case 5 -> {
				System.out.print("Enter PIN: ");
				String histPin = sc.next();
				atm.showTransactionHistory(activeAccount, histPin);
			}
			
			case 6->{
				
				System.out.println("Enter Sender Account No: ");
				String senderacc=sc.next();
				System.out.println("Enter Receiver Account No: ");
				String receiveracc=sc.next();
				System.out.println("Enter Amount to Transfer: ");
				double amount=sc.nextDouble();
//				System.out.println("Enter PIN: ");
//				String pin=sc.next();
				atm.AccountoAccountTranser(activeAccount, senderacc, receiveracc, amount);
				
			}

			case 7-> {
				System.out.println("Thank you for using ATM!");
				sc.close();
				System.exit(0);
			}

			default -> {
				System.out.println("Invalid Choice!");
			}
			}
		}
	}

}
