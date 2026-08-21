package Java8Features.DilipSir.OptionalClasses;

import java.util.Optional;

public class OptionalClassDemoII {

    static Optional<String> getName() {

        String name = "Dilip";
        Optional<String> value = null;

        if (name == null) value = Optional.empty();
        else value = Optional.of(name);

        return value;
    }


    public static void main(String[] args) {

        // filter(Predicate) : checks the value inside Optional using the Predicate.
//                             if Predicate returns true  → returns Optional with the value.
//                             if Predicate returns false → returns Optional.empty().
//                             if Optional is already empty → returns Optional.empty().

        Optional<String> nameContainer = getName();
        System.out.println(nameContainer.filter(val -> val.equalsIgnoreCase("DILIP SINGH")).or(() -> Optional.of("DILIP SINGH")).get());




        // map(Function mapper) : if value is present, apply the Function to that value
//                                and return a new Optional containing the transformed value.
//                                if Optional is empty, return Optional.empty().


        Optional<String> name=Optional.of("hardik");

        // upperCase of value

       String result= name.map(val->val.toUpperCase()).get();
        System.out.println(result);


        // Nested optional object

        Optional<Optional<String>> nameContainerI=Optional.of(Optional.of("sneha"));
      Optional<String> res=  nameContainerI.map(val->val.get());
      String ans=res.map(val->val.toUpperCase()).get();
        System.out.println(ans);


        // flatMap(Function mapper) : if value is present, apply the Function.
//                                   The Function itself must return an Optional.
//                                   flatMap() prevents creating a nested Optional.
//                                  if Optional is empty, it returns Optional.empty().

        Optional<Optional<String>> nameContainerII=Optional.of(Optional.of("raju"));
        String answer=nameContainerII.flatMap(val->val).get().toUpperCase();
        System.out.println(answer);

    }
}

