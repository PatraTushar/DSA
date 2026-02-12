package OOPS.ExceptionHandling.trycatchblock;

public class Test {

    public static void main(String[] args) {

        int a=10;
        int b=0;

        try {
            int c=a/b;
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(" hello ");
    }
}
