package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public class ClassThree implements InterfaceOne, InterfaceTwo {

    @Override
    public void printNames() {
        System.out.println(" printNames() of classThree ");
    }

    @Override
    public String getNames() {

        System.out.println(" getNames() of classThree ");
        return " classThree ";
    }


    @Override
    public void defaultMethodFive() {

        InterfaceOne.super.defaultMethodFive();
        InterfaceTwo.super.defaultMethodFive();
    }
}
