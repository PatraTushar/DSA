package OopsByKK.AnnonymousInnerClass.AnnonymousInnerClassExtendingAClass;

class Animal{
    void makeSound(){

        System.out.println(" Animal makes a sound ");
    }
}
public class AnonymousClassExample {

    public static void main(String[] args) {

        //Yes, that's correct! An anonymous inner class is often used to override methods of a class (or interface) that the reference type points to.

        Animal obj=new Animal(){

            void makeSound(){


                System.out.println(" dog barks ");
            }
        };
        obj.makeSound();

    }
}
