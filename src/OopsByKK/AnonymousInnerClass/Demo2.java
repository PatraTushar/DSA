package OopsByKK.AnonymousInnerClass;


// Anonymous Inner Class with Fields & Instance Initializer

class Person{

    void show(){

        System.out.println(" Person ");
    }
}
public class Demo2 {

    public static void main(String[] args) {

        Person p=new Person(){

            String name="Tushar";

            {
                System.out.println(" Anonymous class initialized ");
            }

            @Override
            void show() {
                System.out.println(" Name : " +name);
            }
        };

        p.show();

    }
}
