package OopsByKK.ExceptionHandling.Throws;

public class ThrowsDemo {

    static void divide(int a,int b) throws ArithmeticException{

        int result=a/b;
        System.out.println(result);


    }

    public static void main(String[] args)  {


        try {
            divide(10,0);
        }catch (ArithmeticException e){
            System.out.println(" cannot divide by zero ");
        }




    }
}
