package Java8Features.DilipSir.FunctionalInterface;

public interface Calculate {

    void printName();

    default void methodOne() {

        System.out.println(" This is a Default Method One ");
    }


    default void methodTwo() {

        System.out.println(" This is a Default Method Two ");

    }


    static void staticMethodOne() {

        System.out.println(" This is a static Method One ");
    }

    static void staticMethodTwo() {

        System.out.println(" This is a static Method Two ");
    }
}
