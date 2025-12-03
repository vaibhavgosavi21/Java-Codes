package model;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private List<Transaction> transactions;

    public TransactionHistory() { 		//constructor
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void printHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("\n===== Transaction History =====");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
            System.out.println("================================");
        }
    }
}
