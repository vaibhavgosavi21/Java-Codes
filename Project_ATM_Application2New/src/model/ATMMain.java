package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ATMMain {
	
	private static void refreshAccountData(Account account, Connection connection) {
		try {
			String query = "SELECT balance, pin FROM accounts WHERE id = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, account.getAccId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				account.setBalance(rs.getDouble("balance"));
				account.setPin(rs.getString("pin"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		Connection connection = null;
		
		try {
			connection = DataBaseConnection.getConnection();
			AtmOperationImpl atm = new AtmOperationImpl();
			
			System.out.println("		===== ATM System =====		");
			System.out.print("Enter Account Password: ");
			String accPassword = sc.next();
			
			String query = "SELECT * FROM accounts WHERE username=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, accPassword);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Login Successful");
				
				String accountId = rs.getString("id");
				double currentBalance = TransactionDAO.getCurrentBalance(accountId);
				
				Account activeAccount = new Account(
					accountId,
					rs.getString("account_number"),
					rs.getString("account_holder_name"),
					currentBalance,
					rs.getString("account_type"),
					rs.getString("mobile_number"),
					rs.getString("pin"),
					rs.getString("username")
				);
				
				while (true) {
					System.out.println("\n		===== ATM System =====		");
					System.out.println("1. Deposit				4. Generate/Update PIN");
					System.out.println("2. Withdraw				5. Show Transaction History");
					System.out.println("3. Balance Enquiry			6. Exit");
					System.out.print("Enter your choice: ");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter Amount to Deposit: ");
						double depAmt = sc.nextDouble();
						System.out.print("Enter PIN: ");
						String depPin = sc.next();
						atm.deposit(activeAccount, depAmt, depPin);
						refreshAccountData(activeAccount, connection);
						break;

					case 2:
						System.out.print("Enter Amount to Withdraw: ");
						double withAmt = sc.nextDouble();
						System.out.print("Enter PIN: ");
						String withPin = sc.next();
						System.out.print("Print Receipt? (true/false): ");
						boolean receipt = sc.nextBoolean();
						atm.withdraw(activeAccount, withAmt, withPin, receipt);
						refreshAccountData(activeAccount, connection);
						break;

					case 3:
						refreshAccountData(activeAccount, connection);
						System.out.print("Enter PIN: ");
						String balPin = sc.next();
						System.out.print("Print Receipt? (true/false): ");
						boolean balReceipt = sc.nextBoolean();
						atm.balanceEnquiry(activeAccount, balPin, balReceipt);
						break;

					case 4:
						System.out.print("Enter your Old PIN: ");
						String oldPin = sc.next();
						atm.generateOrUpdatePin(activeAccount, oldPin);
						refreshAccountData(activeAccount, connection);
						break;

					case 5:
						System.out.print("Enter PIN: ");
						String histPin = sc.next();
						atm.showTransactionHistory(activeAccount, histPin);
						break;

					case 6:
						System.out.println("Thank you for using ATM!");
						sc.close();
						System.exit(0);
						break;

					default:
						System.out.println("Invalid Choice!");
					}
				}
			} else {
				System.out.println("Wrong Password");
			}
			
		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			DataBaseConnection.close(connection);
			sc.close();
		}
	}
}
