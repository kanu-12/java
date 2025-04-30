import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double ini_Balance) {
        this.balance = ini_Balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double ini_Balance = sc.nextDouble();
        BankAccount account = new BankAccount(ini_Balance);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);  
            } else if (choice == 3) {
                account.checkBalance();  
            } else if (choice == 4) {
                System.out.println("Exiting. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
