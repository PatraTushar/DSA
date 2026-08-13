package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public class ClassOne implements InterfaceOne {

    @Override
    public void printNames() {

        System.out.println(" Printing names ");

    }

    @Override
    public String getNames() {

        System.out.println(" Getting Names ");
        return " default Method ";


    }


    public void defaultMethodOne(){

        System.out.println(" Inside classOne : defaultMethodOne ");
    }
}
