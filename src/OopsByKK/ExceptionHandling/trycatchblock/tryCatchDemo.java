package OopsByKK.ExceptionHandling.trycatchblock;

public class tryCatchDemo {

    static int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {

        try {
            int ans=divide(10,0);
        }
        catch (ArithmeticException e){

            System.out.println(" cannot divided by zero  ");  // exception handled

        }

        System.out.println(" program continues ");


    }
}
