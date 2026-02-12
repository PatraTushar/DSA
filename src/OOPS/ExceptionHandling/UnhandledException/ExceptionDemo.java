package OOPS.ExceptionHandling.UnhandledException;


public class ExceptionDemo {

    static int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {

      int ans=  divide(10,0);
        System.out.println(ans);


    }
}
