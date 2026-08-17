package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public interface InterfaceOne {

    void printNames();

    String getNames();

    default void defaultMethodOne() {

        System.out.println(" Inside defaultMethodOne ");
    }

    default String defaultMethodTwo() {

        System.out.println(" Inside defaultMethodTwo ");

        return "defaultMethodTwo";

    }

    default void defaultMethodFive() {

        System.out.println(" Inside InterfaceOne : DefaultMethodFive() ");
    }

    static String staticMethodOne() {

        System.out.println(" InterfaceOne : Static Method one ");

        return " This is a static method ";
    }

    static void staticMethodTwo() {

        System.out.println(" InterfaceOne : Static Method Two ");
    }




}
