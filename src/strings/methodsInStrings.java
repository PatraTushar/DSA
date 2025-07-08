package strings;

import java.util.Arrays;

public class methodsInStrings {

    public static void main(String[] args) {
        String name="kunal kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('l'));
        System.out.println("     kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
