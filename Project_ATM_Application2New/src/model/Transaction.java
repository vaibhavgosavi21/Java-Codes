package model;

import java.time.LocalDateTime;

public class Transaction {
    private String type;            // Deposit / Withdraw / Balance Enquiry
    private double amount;
    private double availableBalance;
    private LocalDateTime dateTime;

    public Transaction(String type, double amount, double availableBalance) {
        this.type = type;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "\n		----- Receipt ----		"+"\nType: 					" + type +"\nAmount: 				" + amount +"\nBalance: 				" + availableBalance +"\nDate & Time: 				" + dateTime;
    }
}
