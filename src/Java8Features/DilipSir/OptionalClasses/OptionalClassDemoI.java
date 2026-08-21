package Java8Features.DilipSir.OptionalClasses;

import java.util.Optional;

public class OptionalClassDemoI {

    static Optional<String> getName() {

        String name = null;
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    static Optional<String> getNameI() {

        String name = "shweta";
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }

    static Optional<String> getNameII() {

        String name = null;
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }

    static Optional<String> getNameIII() {


        String name = "mohan";
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    static Optional<String> getNameIV() {

        String name = "raj";
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    public static void main(String[] args) {


        // or() :   if value is present, return the current Optional object.
        //        if value is absent, execute the Supplier and return the Optional produced by the Supplier.

        Optional<String> nameContainer = getName();
        String result = nameContainer.or(
                () -> {
                    return Optional.of("java optional or value");
                }
        ).get();
        System.out.println(result);


        //orElse() : if value is present, return the actual value.
        //           if value is not present, return the default value given inside orElse().

        Optional<String> nameContainerI = getNameI();

        String resultI = nameContainerI.orElse("This is orElse() method value ");
        System.out.println(resultI);


        // orElseGet() : if value is present, return the actual value.
//                       if value is not present, Supplier will generate/return a default value.

        Optional<String> nameContainerII = getNameII();
        String resultII = nameContainerII.orElseGet(() -> {

            return "This is orElse() method";
        });
        System.out.println(resultII);


        // orElseThrow() : if value is present, return the actual value.
//                         if value is not present, throw an exception.

        Optional<String> nameContainerIII = getNameIII();
        String resultIII = nameContainerIII.orElseThrow();
        System.out.println(resultIII);


        // orElseThrow(Supplier) : if value is present, return the actual value.
//                                 if value is not present, Supplier will create and throw the exception.

        Optional<String> nameContainerIV = getNameIV();
        String resultIV=null;
        try {
             resultIV = nameContainerIV.orElseThrow(
                    () -> {
                        return new Exception("This is an Exception");
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(resultIV);



    }
}
