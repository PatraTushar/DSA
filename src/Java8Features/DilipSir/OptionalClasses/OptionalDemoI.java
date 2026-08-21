package Java8Features.DilipSir.OptionalClasses;

import java.util.Optional;

public class OptionalDemoI {

    static Optional<String> getName() {

        String name = null;
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    public static void main(String[] args) {

        Optional<String> nameContainer = getName();

        // or() :   if value is present, return the current Optional object.
        //        if value is absent, execute the Supplier and return the Optional produced by the Supplier.

        String res = nameContainer.or(
                () -> {
                    return Optional.of("java optional or value");
                }
        ).get();
        System.out.println(res);


    }
}
