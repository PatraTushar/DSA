package OopsByKK.Generics.GenericMethod;

public class Utility {

    public static <T> void printData(T data){

        System.out.println(" Data: " +data);
    }

    public static void main(String[] args) {

        //Example 1: Print Any Type of Value

        Utility.printData(" Rohit ");
        Utility.printData(10);
        Utility.printData(3.14);


    }
}
