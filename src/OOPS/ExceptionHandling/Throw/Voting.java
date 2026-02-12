package OOPS.ExceptionHandling.Throw;
import java.util.Scanner;

class YoungerAgeException extends RuntimeException{

    YoungerAgeException(String message){
        super(message);
    }

}
public class Voting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter age ");
        int age=sc.nextInt();

        try {

            if (age < 18) {

                throw new YoungerAgeException(" not eligible to vote ");
            } else {
                System.out.println(" eligible to vote ");
            }

        }catch (YoungerAgeException e){
            System.out.println(e);
        }

        System.out.println(" hello");

    }
}
