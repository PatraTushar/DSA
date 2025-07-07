package OopsByKK.Generics.GenericInterface;

interface Printer<T>{

    void print(T value);
}
public class StringPrinter  implements  Printer<String>{

    public void print(String value){

        System.out.println(" String " +value);
    }
}
