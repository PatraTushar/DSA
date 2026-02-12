package OOPS.AnonymousInnerClass;


// Anonymous innerclass  Extending a Class

abstract class Animal{

    abstract void sound();
}
public class ExtendingAClass {

    public static void main(String[] args) {


        Animal dog=new Animal() {
            @Override
            void sound() {
                System.out.println(" Animal bark ");
            }
        };


        dog.sound();




    }
}
