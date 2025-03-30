package OopsByKK.Generics.Basics;

public class genericMethod {

    static <T> void printData(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData("hello");
        printData(100);

    }
}
