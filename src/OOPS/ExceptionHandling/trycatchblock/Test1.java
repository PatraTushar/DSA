package OOPS.ExceptionHandling.trycatchblock;

public class Test1 {

    static void divide(int a,int b){

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println(" hello ");




    }

    public static void main(String[] args) {

        divide(10,0);



    }
}
