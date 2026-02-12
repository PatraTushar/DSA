package OOPS.ExceptionHandling.Finally;

public class FinallyDemo {

    static int divide(int a,int b){

        return a/b;
    }

    public static void main(String[] args) {

        try {
            System.out.println(" inside try block ");
            int ans=divide(10,0);

        }

        catch(ArithmeticException e) {

            System.out.println(" exception caught ");


        }

        finally {
            System.out.println(" finally block executes ");
        }

    }
}
