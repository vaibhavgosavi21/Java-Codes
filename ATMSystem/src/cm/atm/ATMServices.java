package cm.atm;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ATMServices {
    private Map<String, Account> accounts;
    private Scanner scanner;

    public ATMServices() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
        initializeAccounts();
    }

    private void initializeAccounts() {
        accounts.put("1234567890123456", new Account("123456789", "John Doe", 50000.0, "Saving", "9876543210", "1234"));
        accounts.put("9876543210987654", new Account("987654321", "Jane Smith", 75000.0, "Current", "9123456789", "5678"));
    }

    public boolean validateCardNumber(String cardNumber) {
        return cardNumber.length() == 16 && cardNumber.matches("\\d+") && accounts.containsKey(cardNumber);
    }

    public boolean validatePin(String cardNumber, String pin) {
        Account account = accounts.get(cardNumber);
        return account != null && account.getPin().equals(pin);
    }

    public void deposit(String cardNumber) {
        Account account = accounts.get(cardNumber);
        System.out.println("\nSelect Account Type:");
        System.out.println("1. Saving");
        System.out.println("2. Current");
        System.out.print("Enter choice: ");
        
        int choice = scanner.nextInt();
        String accountType = (choice == 1) ? "Saving" : "Current";
        
        if (!account.getAccountType().equalsIgnoreCase(accountType)) {
            System.out.println("Invalid account type for this card!");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        System.out.print("Enter PIN: ");
        String pin = scanner.next();
        
        if (validatePin(cardNumber, pin)) {
            Transaction transaction = new Transaction(accountType);
            transaction.depositTransaction(account, amount);
        } else {
            System.out.println("Invalid PIN!");
        }
    }

    public void withdraw(String cardNumber) {
        Account account = accounts.get(cardNumber);
        System.out.println("\nSelect Account Type:");
        System.out.println("1. Saving");
        System.out.println("2. Current");
        System.out.print("Enter choice: ");
        
        int choice = scanner.nextInt();
        String accountType = (choice == 1) ? "Saving" : "Current";
        
        if (!account.getAccountType().equalsIgnoreCase(accountType)) {
            System.out.println("Invalid account type for this card!");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        System.out.print("Enter PIN: ");
        String pin = scanner.next();
        
        if (validatePin(cardNumber, pin)) {
            Transaction transaction = new Transaction(accountType);
            if (transaction.withdrawTransaction(account, amount)) {
                System.out.print("Print receipt? (yes/no): ");
                String receipt = scanner.next();
                if (receipt.equalsIgnoreCase("yes")) {
                    printReceipt(account, amount, "Withdrawal");
                }
            }
        } else {
            System.out.println("Invalid PIN!");
        }
    }

    public void balanceEnquiry(String cardNumber) {
        System.out.print("Print receipt? (yes/no): ");
        String receipt = scanner.next();
        
        System.out.print("Enter PIN: ");
        String pin = scanner.next();
        
        if (validatePin(cardNumber, pin)) {
            Account account = accounts.get(cardNumber);
            Transaction transaction = new Transaction(account.getAccountType());
            double balance = transaction.availableBalance(account);
            System.out.println("Available Balance: Rs. " + balance);
            transaction.printDateTime();
            
            if (receipt.equalsIgnoreCase("yes")) {
                printReceipt(account, balance, "Balance Enquiry");
            }
        } else {
            System.out.println("Invalid PIN!");
        }
    }

    public void generateOrUpdatePin(String cardNumber) {
        Account account = accounts.get(cardNumber);
        System.out.print("Enter Account Number or Mobile Number: ");
        String input = scanner.next();
        
        if (input.equals(account.getAccountNumber()) || input.equals(account.getMobileNumber())) {
            String otp = generateOTP();
            System.out.println("OTP sent to your mobile: " + otp);
            System.out.print("Enter OTP: ");
            String enteredOtp = scanner.next();
            
            if (otp.equals(enteredOtp)) {
                System.out.print("Enter new PIN (4 digits): ");
                String newPin = scanner.next();
                
                if (newPin.length() == 4 && newPin.matches("\\d+")) {
                    account.setPin(newPin);
                    System.out.println("PIN updated successfully!");
                } else {
                    System.out.println("Invalid PIN format!");
                }
            } else {
                System.out.println("Invalid OTP!");
            }
        } else {
            System.out.println("Invalid Account Number or Mobile Number!");
        }
    }

    private String generateOTP() {
        return String.valueOf(1000 + new Random().nextInt(9000));
    }

    private void printReceipt(Account account, double amount, String transactionType) {
        System.out.println("\n========== RECEIPT ==========");
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Transaction Type: " + transactionType);
        if (!transactionType.equals("Balance Enquiry")) {
            System.out.println("Amount: Rs. " + amount);
        }
        System.out.println("Available Balance: Rs. " + account.getAccountBalance());
        System.out.println("=============================\n");
    }
}
