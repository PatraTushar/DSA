package Java8Features.DilipSir.OptionalClasses;

import java.util.Optional;

public class OptionalClassDemo {

    public static Optional<String> getName() {

        // keep the actual value inside optional object(container object)

        String name = "Tushar Patra";

        Optional<String> value = Optional.of(name);

        return value;
    }


    static Optional<String> getNameI() {

        String name = "rohan";
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    static Optional<String> getNameII() {

        String name = "shreya";
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }

    static Optional<String> getNameIII() {

        String name = null;
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    public static void main(String[] args) {

        Optional<String> nameContainer = getNameI();

        // isPresent() :   checks whether the Optional contains a value. Returns true if value is present, otherwise false.

        if (nameContainer.isPresent()) {

            String name = nameContainer.get();
            name = name.toUpperCase();
            System.out.println(name);
        } else System.out.println(" value is not available ");


        // isEmpty() : checks whether the Optional does NOT contain a value.Returns true if value is absent, otherwise false.
        if (nameContainer.isEmpty()) System.out.println("Yes,Empty");
        else System.out.println(nameContainer.get());


        // ifPresent() :  executes the given action only if a value is present.If value is absent, nothing happens.

        Optional<String> container = getNameII();

        container.ifPresent(val -> {

            System.out.println(val.toUpperCase());
        });


        // ifPresentOrElse() : executes one action if a value is present,otherwise executes another action if the value is absent.
        Optional<String> c = getNameIII();
        c.ifPresentOrElse(val -> {
            System.out.println("Value is Present Convert to UpperCase");
            System.out.println(val.toUpperCase());

        }, () -> {
            System.out.println("Value is not Present");

        });







    }
}
