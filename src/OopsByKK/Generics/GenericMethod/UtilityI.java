package OopsByKK.Generics.GenericMethod;

public class UtilityI {

    public static <T> T returnSame(T data){

        return data;
    }

    public static void main(String[] args) {

        // Example 2: Return a Value of Any Type

        System.out.println(UtilityI.returnSame(" Hello Generics "));
        System.out.println(UtilityI.returnSame(500));
        System.out.println(UtilityI.returnSame(2.45));
    }
}
