package OOPS.Interfaces.SeparateClassesImplementingTheSameInterface;

// Define a interface for payment processing

interface Payment{

    // Interface variable (constants)->public,static,final
    String company="SecurePay";

    //Abstract methods(must be implemented by all classes)

    void initiatePayment(double amount);
    void verifyTransaction();

    // Default methods(java 8)- provide common behaviour
    default void transactionStatus(){
        System.out.println(" Transaction status pending ....");
    }

    // static methods(java 8) ->called without an object
    static void paymentGatewayInfo(){
        System.out.println(" using SecurePay Gateway for processing ");
    }

    // private method(java 9) ->used inside default method
    private void logTransaction(){
        System.out.println(" Transaction logged in securePay database");
    }
    default void secureTransaction(){
        logTransaction();
        System.out.println(" Transaction secured ");
    }
}

// implement interface in separate classes

class creditCard implements Payment{

    public void initiatePayment(double amount){
        System.out.println("Credit Card Payment of $" + amount + " initiated.");
    }

    public void verifyTransaction(){
        System.out.println("Credit Card Transaction Verified.");
    }


    //override default transaction method
    public void transactionStatus(){
        System.out.println("Credit Card Payment is being processed...");

    }

}

class PayPal implements Payment{

    public void initiatePayment(double amount){
        System.out.println("PayPal Payment of $" + amount + " initiated.");
    }

    public void verifyTransaction(){
        System.out.println(" PayPal Transaction Verified.");
    }
}

class UPI implements Payment{

    public void initiatePayment(double amount){
        System.out.println(" UPI Payment of $" + amount + " initiated.");
    }

    public void verifyTransaction(){
        System.out.println(" UPI Transaction Verified.");
    }

    //overriding default method
    public void transactionStatus() {
        System.out.println("UPI Payment is successful.");
    }



}

// testing with polymorphism

public class PaymentTest {

    public static void main(String[] args) {

        // Polymorphism: Using interface reference for different payment methods

        Payment obj=new creditCard();
        Payment obj2=new PayPal();
        Payment obj3=new UPI();

        // initiating payments

        obj.initiatePayment(100);
        obj.verifyTransaction();
        obj.transactionStatus();  // overridden method
        obj.secureTransaction();  // calls private method internally


        System.out.println(" ------------------------- ");

        obj2.initiatePayment(200);
        obj2.verifyTransaction();
        obj2.transactionStatus();
        obj2.secureTransaction();

        System.out.println(" ---------------------------- ");

        obj3.initiatePayment(50);
        obj3.verifyTransaction();
        obj3.transactionStatus();
        obj3.secureTransaction();

        // calling static method from the interface

        Payment.paymentGatewayInfo();

    }
}
