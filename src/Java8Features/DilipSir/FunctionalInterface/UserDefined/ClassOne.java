package Java8Features.DilipSir.FunctionalInterface.UserDefined;

import Java8Features.DilipSir.FunctionalInterface.UserDefined.Calculate;

public class ClassOne implements Calculate {

    @Override
    public void printName() {

        System.out.println(" Inside ClassOne : printName() ");
    }
}
