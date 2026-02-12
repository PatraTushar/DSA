package OOPS.Properties.Encapsulation;
// A simple example demonstrating encapsulation
class BankAccount {
    private String accountNumber;  // Private instance variable (data hiding)
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (Encapsulation allows controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println(" total balance " +balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdrawal method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println(" total balance "+balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 5000);

        // Accessing data through encapsulated methods
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());

        myAccount.deposit(2000);  // Depositing money
        myAccount.withdraw(1500); // Withdrawing money

        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}

