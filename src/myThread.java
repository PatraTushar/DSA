import java.util.Scanner;

public class myThread {

    static class TooYoungException extends RuntimeException{

        TooYoungException(String s){

            super(s);
        }
    }

    static class TooOldException extends RuntimeException{

        TooOldException(String s){
            super(s);
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter age ");
        int age=sc.nextInt();

        if (age<18){

            throw new TooYoungException(" You are too Young and You cant marry ");
        }

        else if (age>60){

            throw new TooOldException(" You are Too old ");
        }

        else {
            System.out.println(" you are eligible for the marriage ");
        };


    }


}








