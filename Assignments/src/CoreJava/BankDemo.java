package CoreJava;

import java.util.Scanner;

// Abstract class Bank
abstract class Bank {
    // Abstract method getBalance
    public abstract int getBalance();
}

// BankA subclass
class BankA extends Bank {
    private int balance;

    // Constructor to set balance
    public BankA(int balance) {
        this.balance = balance;
    }

    // Override getBalance method
    @Override
    public int getBalance() {
        return balance;
    }
}

// BankB subclass
class BankB extends Bank {
    private int balance;

    // Constructor to set balance
    public BankB(int balance) {
        this.balance = balance;
    }

    // Override getBalance method
    @Override
    public int getBalance() {
        return balance;
    }
}

// BankC subclass
class BankC extends Bank {
    private int balance;

    // Constructor to set balance
    public BankC(int balance) {
        this.balance = balance;
    }

    // Override getBalance method
    @Override
    public int getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for BankA
        System.out.println("Enter the deposit amount for Bank A: ");
        int depositA = sc.nextInt();
        BankA bankA = new BankA(depositA);

        // Get user input for BankB
        System.out.println("Enter the deposit amount for Bank B: ");
        int depositB = sc.nextInt();
        BankB bankB = new BankB(depositB);

        // Get user input for BankC
        System.out.println("Enter the deposit amount for Bank C: ");
        int depositC = sc.nextInt();
        BankC bankC = new BankC(depositC);

        // Display balances
        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());

        sc.close();
    }
}
