package OopsByKK.AnnonymousInnerClass.AnnonymousInnerClassExtendingAClass;

class Animal{
    void makeSound(){

        System.out.println(" Animal makes a sound ");
    }
}
public class AnonymousClassExample {

    public static void main(String[] args) {

        Animal obj=new Animal(){

            void makeSound(){
                System.out.println(" dog barks ");
            }
        };
        obj.makeSound();

    }
}
