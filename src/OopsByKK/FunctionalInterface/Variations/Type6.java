package OopsByKK.FunctionalInterface.Variations;

// 6. Functional Interface with Multiple Default Methods

interface MyFunc {
    void execute();

    default void defaultOne() {
        System.out.println("Default One");
    }

    default void defaultTwo() {
        System.out.println("Default Two");
    }
}
public class Type6 {

    public static void main(String[] args) {

        MyFunc f=new MyFunc() {
            @Override
            public void execute() {
                System.out.println("Executing");
            }
        };

        f.execute();
        f.defaultOne();
        f.defaultTwo();



    }
}
