package OOPS.ExceptionHandling.Throw;

public class ThrowDemo {

    static void validate(int age){

        if(age<18){
            throw new IllegalArgumentException(" not eligible for voting ");
        }

    }

    public static void main(String[] args) {

        validate(14);  //Throws Exception

    }
}
