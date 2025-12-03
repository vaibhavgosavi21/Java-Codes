package cm.atm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Transaction {
    private String transactionId;
    private String accountType;

    public Transaction(String accountType) {
        this.accountType = accountType;
        this.transactionId = generateTransactionId();
    }

    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis() + new Random().nextInt(1000);
    }

    public boolean withdrawTransaction(Account account, double amount) {
        if (account.getAccountBalance() >= amount) {
            if (account.getAccountType().equalsIgnoreCase("Saving") && amount > 500000) {
                System.out.println("Withdrawal limit exceeded for Saving account (Max: 5,00,000)");
                return false;
            }
            account.setAccountBalance(account.getAccountBalance() - amount);
            System.out.println("Amount withdrawn successfully!");
            printDateTime();
            return true;
        } else {
            System.out.println("Insufficient balance!");
            return false;
        }
    }

    public void depositTransaction(Account account, double amount) {
        account.setAccountBalance(account.getAccountBalance() + amount);
        System.out.println("Amount deposited successfully!");
        printDateTime();
    }

    public double availableBalance(Account account) {
        return account.getAccountBalance();
    }

    public void printDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Transaction Date & Time: " + now.format(formatter));
        System.out.println("Transaction ID: " + transactionId);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountType() {
        return accountType;
    }
}
