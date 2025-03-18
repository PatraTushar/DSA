
class BankAccount{

   private String AccountNumber;
   private double balance;

   BankAccount(String AccountNumber,double balance){

       this.AccountNumber=AccountNumber;
       this.balance=balance;
   }

   public String getAccountNumber(){
       return AccountNumber;
    }

    public double getBalance(){
       return balance;
    }

    public void deposit(int amount){

       if(amount>0){
           balance+=amount;
           System.out.println(" deposited amount " +amount);
           System.out.println(" total amount " + balance);
       }

       else {
           System.out.println(" invalid deposit ");

       }


    }

    public void withdraw(int amount){

       if(amount>0 && amount<=balance){
           balance-=amount;
           System.out.println(" withdrawn amount " +amount);
           System.out.println(" total amount " + balance);

       }

       else{
           System.out.println(" invalid amount ");
       }
    }


}

public class Encapsulation {



    public static void main(String[] args) {

        BankAccount obj=new BankAccount("12345",40000);
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());

        obj.deposit(2000);
        obj.withdraw(30000);

        System.out.println(obj.getBalance());



    }

}