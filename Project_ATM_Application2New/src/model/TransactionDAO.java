package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDAO {
    
    public static void saveTransaction(String accountId, String type, double amount, double balanceAfter) {
        String query = "INSERT INTO transaction_history (account_id, transaction_type, amount, balance_after) VALUES (?, ?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, accountId);
            ps.setString(2, type);
            ps.setDouble(3, amount);
            ps.setDouble(4, balanceAfter);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void showHistory(String accountId) {
        if (accountId == null) {
            System.out.println("Error: Account ID is null");
            return;
        }
        
        String query = "SELECT * FROM transaction_history WHERE account_id = ? ORDER BY transaction_date DESC";
        try (Connection conn = DataBaseConnection.getConnection()) {
            if (conn == null) {
                System.out.println("Error: Database connection failed");
                return;
            }
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, accountId);
            ResultSet rs = ps.executeQuery();
            
            System.out.println("\n===== Transaction History =====");
            
            boolean hasTransactions = false;
            while (rs.next()) {
                hasTransactions = true;
                System.out.println("Type: " + rs.getString("transaction_type") + 
                                 " | Amount: " + rs.getDouble("amount") + 
                                 " | Balance: " + rs.getDouble("balance_after") + 
                                 " | Date: " + rs.getTimestamp("transaction_date"));
            }
            
            if (!hasTransactions) {
                System.out.println("No transactions found for this account.");
            }
            System.out.println("================================");
            
        } catch (SQLException e) {
            System.out.println("Error retrieving transaction history: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void updateAccountBalance(String accountId, double newBalance) {
        String query = "UPDATE accounts SET balance = ? WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setDouble(1, newBalance);
            ps.setString(2, accountId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateAccountPin(String accountId, String newPin) {
        String query = "UPDATE accounts SET pin = ? WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newPin);
            ps.setString(2, accountId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static double getCurrentBalance(String accountId) {
        String query = "SELECT balance FROM accounts WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, accountId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}