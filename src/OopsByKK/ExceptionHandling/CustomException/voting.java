package OopsByKK.ExceptionHandling.CustomException;

class underAgeException extends Exception {

    underAgeException() {
        super(" hello exception ");
    }

    underAgeException(String message) {
        super(message);
    }
}

public class voting {

    public static void main(String[] args) {

        // custom checked exception


        int age = 19;
        try {
            if (age < 18) {
                throw new underAgeException();
            }

            else {
                System.out.println(" u can vote ");
            }
        }catch (underAgeException e){
            System.out.println(e);
        }


    }
}
