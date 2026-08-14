package Java8Features.DilipSir.DefaultAndStaticMethods.Example1;

public class ClassFour implements InterfaceOne {

    @Override
    public void printNames() {
        System.out.println(" Inside Class Four : printNames() ");
    }

    @Override
    public String getNames() {
        System.out.println(" Inside Class Four : getNames() ");
        return "Class Four";
    }
}
