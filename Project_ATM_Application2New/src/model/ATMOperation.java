package model;

public interface ATMOperation {
    void deposit(Account account, double amount, String pin);
    void withdraw(Account account, double amount, String pin, boolean printReceipt);
    void balanceEnquiry(Account account, String pin, boolean printReceipt);
    void generateOrUpdatePin(Account account, String oldPin);
    void showTransactionHistory(Account account, String pin);
}
