package Java8Features.DilipSir.FunctionalInterface.UserDefined;

@FunctionalInterface
public interface calculationOperation {

    double operation(int a, int b);

   default void printInfo(){

        System.out.println(" default method inside calculationOperation interface  ");

    }


    static void typeOperation(){


        System.out.println(" static  method inside calculationOperation interface  ");

    }

}
