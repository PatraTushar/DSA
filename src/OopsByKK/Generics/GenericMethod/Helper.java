package OopsByKK.Generics.GenericMethod;

public class Helper {

    public static <T,V> void printPair(T first,V second){

        System.out.println("First: " + first + ", Second: " + second);


    }

    public static void main(String[] args) {

        // Generic Method with Two Type Parameters

        Helper.printPair("Age", 21);
        Helper.printPair(3.14, true);




    }
}
