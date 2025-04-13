package OopsByKK;


public class practice {

    static int divide(int a,int b){

        return a/b;
    }


    public static void main(String[] args)  {


        try {
            int ans=divide(10,0);
            System.out.println(ans);
            System.out.println(" hello world ");
        }catch (ArithmeticException e){


            System.out.println(" cannot divide by zero ");
        //    e.printStackTrace();

            System.out.println(e.getMessage());
            System.out.println(e);

        }finally {
            System.out.println(" i am fine ");

        }
        System.out.println(" program continues ");

















    }


}

