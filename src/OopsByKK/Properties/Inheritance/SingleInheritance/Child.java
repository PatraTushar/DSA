package OopsByKK.Properties.Inheritance.SingleInheritance;

import java.security.PublicKey;

public class Child extends Parent {

    String hobby;


    // Default constructor
    public Child(){

        super();    // calls Parent()
        this.hobby="None";
    }


    // Parameterized constructor
    public Child(String name,int age,String hobby){

        super(name,age);  // calls Parent(String, int)
        this.hobby=hobby;


    }


    // Copy constructor
    public Child(Child other){

        super(other);   // calls Parent(Parent)
        this.hobby=other.hobby;
    }


    // Own method
    public void show() {
        super.display();   // accessing parent method
        System.out.println("Hobby: " + hobby);
    }


    public static void main(String[] args) {




    }


}
