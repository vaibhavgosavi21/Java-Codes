package cm.atm;
S
import java.util.Scanner;

public class ATM {
    private ATMServices atmServices;
    private Scanner scanner;

    public ATM() {
        atmServices = Nnew ATMServices();
        scanner = new Scanner(System.in);
    }

    public void displayMainMenu() {
        System.out.println("\n========== ATM MAIN MENU ==========");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Generate PIN / Update PIN");
        System.out.println("5. Exit");
        System.out.println("===================================");
        System.out.print("Enter your choice: ");
    }

    public void start() {
        System.out.println("Welcome to ATM System");
        System.out.print("Enter 16-digit ATM card number: ");
        String cardNumber = scanner.next();

        if (!atmServices.validateCardNumber(cardNumber)) {
            System.out.println("Invalid card number!");
            return;
        }

        boolean continueTransaction = true;
        while (continueTransaction) {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atmServices.deposit(cardNumber);
                    break;
                case 2:
                    atmServices.withdraw(cardNumber);
                    break;
                case 3:
                    atmServices.balanceEnquiry(cardNumber);
                    break;
                case 4:
                    atmServices.generateOrUpdatePin(cardNumber);
                    break;
                case 5:
                    System.out.println("Thank you for using ATM. Have a great day!");
                    continueTransaction = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            if (continueTransaction) {
                System.out.print("\nDo you want to perform another transaction? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println("Thank you for using ATM. Have a great day!");
                    continueTransaction = false;
                }
            }
        }
    }
}
