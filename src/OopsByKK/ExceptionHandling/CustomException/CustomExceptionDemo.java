package OopsByKK.ExceptionHandling.CustomException;


class AgeException extends  Exception{

    AgeException(String message){
        super(message);
    }
}
public class CustomExceptionDemo {

    public static void validate(int age) throws AgeException{
        if(age<18){
            throw new AgeException(" age must be 18+ to vote ");
        }
    }

    public static void main(String[] args) {

        try {
            validate(15);
        }catch (AgeException e){
            System.out.println(" caught " +e.getMessage());

        }


    }
}
