package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public class ClassTwo implements InterfaceOne {

    @Override
    public void printNames() {

        System.out.println(" Inside classTwo : printNames ");

    }

    @Override
    public String getNames() {

        System.out.println(" Inside classTwo: getNames ");
        return "classTwo";
    }
}
