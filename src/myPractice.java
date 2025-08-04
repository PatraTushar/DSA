import java.util.Arrays;

class Animal {

    void eat() {

        System.out.println(" Animal eats ");
    }
}

class Dog extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println(" Dog is running ");
    }
}




public class myPractice {


    public static class utilities{

        public static <T extends Animal & Runnable> void process(T obj){

            obj.run();
            obj.eat();


        }
    }

    public static void main(String[] args) {

        utilities.process(new Dog());
    }


}
