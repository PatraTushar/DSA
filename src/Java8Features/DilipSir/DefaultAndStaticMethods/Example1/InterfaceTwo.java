package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public interface InterfaceTwo {

    default void defaultMethodThree() {

        System.out.println(" Inside InterfaceTwo : defaultMethodThree() ");
    }

    default void defaultMethodFive(){

        System.out.println(" Inside InterfaceTwo : DefaultMethodFive() ");
    }
}
