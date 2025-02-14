package OopsByKK.Properties.Polymorphism;

// can we override static methods ?
//Ans-No Dynamic Dispatch: Method overriding relies on dynamic dispatch, where the method to be called is determined at runtime based on the actual object type. However, since static methods are not polymorphic and don't participate in dynamic dispatch, the concept of overriding doesn't apply to them.
class Parent {
    // Static method in the parent class
    static void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    // Attempt to override the static method (this is not overriding, it's hiding)
    static void display() {
        System.out.println("Display method in Child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();  // Parent class reference, Child class object

        // Calling static method via reference variable
        parent.display();  // Calls Parent's display() method
        child.display();   // Calls Parent's display() method, not Child's (this is not dynamic dispatch)
    }
}

