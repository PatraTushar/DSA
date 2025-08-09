package OopsByKK.FunctionalInterface.Variations;

// 4. Functional Interface with Default and Static Methods

interface Greeting{

    void sayHello(String name);

    default void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    static void greetEveryone() {
        System.out.println("Hello everyone!");
    }


}
public class Type4 {

    public static void main(String[] args) {

        Greeting g=new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println(name);
            }
        };

        g.sayHello("RAHUL");
        g.sayGoodbye();
        Greeting.greetEveryone();

    }
}
