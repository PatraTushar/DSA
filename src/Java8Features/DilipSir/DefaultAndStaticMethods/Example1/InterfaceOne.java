package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public interface InterfaceOne {

    void printNames();
    String getNames();

    default void defaultMethodOne(){

        System.out.println(" Inside defaultMethodOne ");
    }

    default String defaultMethodTwo(){

        System.out.println(" Inside defaultMethodTwo ");

        return "defaultMethodTwo";

    }
}
