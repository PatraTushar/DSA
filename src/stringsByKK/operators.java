package stringsByKK;

//import ArraysbyKK.ArrayList;
import java.util.ArrayList;

public class operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b');    // adding the ascii value
        System.out.println("a" + "b");  // concatenate
        System.out.println('a' +3);
        System.out.println((char)('a' +3));
        System.out.println((int)('a'));
        System.out.println("a" + 1); // integer will convert it into Integer that will call toString()
        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(45));
        System.out.println( new Integer(45) + "" + new ArrayList<>() );

    }

}
