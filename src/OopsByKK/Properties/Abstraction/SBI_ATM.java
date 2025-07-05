package OopsByKK.Properties.Abstraction;

interface ATMOperations{

    void checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
public class SBI_ATM implements ATMOperations {



    private double balance;

    public SBI_ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

}

  class ATMAbstractionDemo{

      public static void main(String[] args) {

          // Using abstraction: reference type is the interface
          ATMOperations userATM = new SBI_ATM(10000);  // ₹10,000 starting balance

          userATM.checkBalance();      // Shows balance
          userATM.deposit(2000);       // Deposit ₹2000
          userATM.withdraw(5000);      // Withdraw ₹5000
          userATM.checkBalance();      // Check updated balance
          userATM.withdraw(9000);      // Try to withdraw more than balance
      }
 }
