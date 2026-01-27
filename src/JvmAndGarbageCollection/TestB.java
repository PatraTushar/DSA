package JvmAndGarbageCollection;

class Customer{}
public class TestB {

    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());
        System.out.println(TestB.class.getClassLoader());   // Loaded by Application (System) ClassLoader
        System.out.println(Customer.class.getClassLoader());  // Loaded by Application (System) ClassLoader


    }
}
