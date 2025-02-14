package OopsByKK.Interfaces.ExtendingInterfaces.DefaultMethodInExtendedInterface;


interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Car interface extends Vehicle
interface Car extends Vehicle {
    default void start() {
        System.out.println("Car is starting with ignition...");
    }
}

// Implementing class
class Tesla implements Car {

    public static void main(String[] args) {
        Tesla myCar = new Tesla();
        myCar.start(); // Calls overridden method in Car interface
    }
}
