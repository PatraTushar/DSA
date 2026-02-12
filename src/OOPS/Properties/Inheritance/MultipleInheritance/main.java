package OOPS.Properties.Inheritance.MultipleInheritance;

public class main {

  static  class A{

        void message(){
            System.out.println(" display method in  class A ");
        }
    }

   static class B extends A{

        void display(){
            System.out.println(" display method in class B ");
        }
    }

    class C extends A{

        void display(){
            System.out.println(" display method in class C ");
        }

    }

//    class D extends B,C{  // Java does not allow this

//    void display() {
//        // Which display method should D inherit: B's or C's?
//    }

//    in diamond problem the classes of D is both B and C so it have all the properties of B and C but it cant extends both at a time java is not allowing so multiple inheritance is nt allowed
//
//    }


    public static void main(String[] args) {

        A obj=new A();
        obj.message();

        B obj2=new B();
        obj2.display();
        obj2.message(); // as the B extends A so it  can access the methods of A   --> B-child class   A-Parent class

        // so multiple inheritance is not used in java
    }
}
