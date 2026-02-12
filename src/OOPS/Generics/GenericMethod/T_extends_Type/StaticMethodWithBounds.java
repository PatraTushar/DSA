package OOPS.Generics.GenericMethod.T_extends_Type;

class Animals {

    void eat() {

        System.out.println("Animal is eating");
    }


}

class Dog extends Animals implements java.lang.Runnable {

    public void run() {
        System.out.println("Dog is running");
    }


}

public class StaticMethodWithBounds {

    public static class Utilities {

        public static <T extends Animals & java.lang.Runnable> void process(T obj) {

            obj.run();
            obj.eat();


        }


    }

    public static void main(String[] args) {

        Utilities.process(new Dog());


    }
}
