


interface ATM_Operation {

    void checkBalance();

    void deposit(double amount);

    void withdraw(double amount);

}


public class SBI implements ATM_Operation {


    private double balance;

    public SBI(double totalBalance) {

        this.balance = totalBalance;
    }

    @Override
    public void checkBalance() {

        System.out.println(" Total Balance is " + balance);
    }


    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println(" Total Balance after deposit is " + balance);
        } else System.out.println(" Invalid amount ");

    }


    @Override
    public void withdraw(double amount) {

        if (amount > 0) {

            balance -= amount;
            System.out.println(" Total Balance after withdraw is " + balance);
        } else System.out.println(" sorry you don't have sufficient balance ");
    }

    public static void main(String[] args) {


        SBI s = new SBI(100000);

        s.checkBalance();

        s.deposit(50000);

        s.withdraw(30000);


    }

}





