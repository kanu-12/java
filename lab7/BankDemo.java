// Bank interface with deposit and withdraw methods
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Account class implementing Bank interface
class Account implements Bank {
    private double balance;

    // Constructor to initialize account balance
    Account(double balance) {
        this.balance = balance;
    }

    // Override method to perform deposit operation
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    // Override method to perform withdrawal operation
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        }
    }
}

// Main class to test the implementation
public class BankDemo {
    public static void main(String[] args) {
        // Create an account with an initial balance
        Account acc = new Account(5000);

        // Perform deposit and withdrawal operations
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000); // This should show an insufficient balance message
    }
}
