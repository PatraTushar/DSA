package OopsByKK.ExceptionHandling.CustomException;

class AgeException extends RuntimeException {

    AgeException() {
        super(" hello world ");
    }

    AgeException(String message) {
        super(message);
    }

}

public class votingSystem {

    public static void main(String[] args) {

        // custom unchecked exception

        int age = 13;
        try {
            if (age < 18) {
                throw new AgeException();
            }

            else {
                System.out.println(" voting is allowed ");
            }

        }catch (AgeException e){
            System.out.println(e);
        }

    }
}
