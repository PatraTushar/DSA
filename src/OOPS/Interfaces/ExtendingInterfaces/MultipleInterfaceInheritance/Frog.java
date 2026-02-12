package OOPS.Interfaces.ExtendingInterfaces.MultipleInterfaceInheritance;


// First parent interface
interface Flyable {
    void fly();
}

// Second parent interface
interface Swimmable {
    void swim();
}

// Child interface extending two parent interfaces
interface Amphibian extends Flyable, Swimmable {}

// Class implementing the extended interface
class Frog implements Amphibian {
    public void fly() {
        System.out.println("Frog cannot fly, but it jumps high!");
    }

    public void swim() {
        System.out.println("Frog swims in the pond.");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.fly();  // Calls the method from Flyable
        frog.swim(); // Calls the method from Swimmable

        Swimmable s=new Frog();
        s.swim();
    }
}
