package CoreJava;

// Custom Exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Class to manage the bank account
class BankAccount {
    private int balance;

    // Constructor to initialize balance
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds account balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Main class to demonstrate the bank account functionality
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount instance with an initial balance of 2000
        BankAccount account = new BankAccount(2000);

        // Display the initial balance
        account.displayBalance();

        // Take user input for withdrawal
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        // Try to withdraw the amount and handle any potential exceptions
        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
