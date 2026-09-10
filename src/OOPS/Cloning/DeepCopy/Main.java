package OOPS.Cloning.DeepCopy;

// Address class (remains the same)
class Address {
    String city;

    Address(String address) {
        this.city = address;
    }
}

// Person class (modified for deep copy)
class Person implements Cloneable {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone(); // Shallow copy first
        cloned.address = new Address(this.address.city); // Deep copy of Address
        return cloned;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + address.city);
    }
}

// Main class (demonstrates deep copy)
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create an Address object
        Address originalAddress = new Address("London");

        // Create a Person object
        Person p1 = new Person("Alice", 30, originalAddress);

        // Clone the Person object (deep copy)
        Person p2 = (Person) p1.clone();

        // Modify the cloned Person's Address
        p2.address.city = "New York";

        // Display the original and cloned Person objects
        System.out.println("Original Person:");
        p1.display(); // Output: Name: Alice, Age: 30, City: London

        System.out.println("\nCloned Person:");
        p2.display(); // Output: Name: Alice, Age: 30, City: New York
    }
}


// this.address.city means: Go to the current Person object's address, then access its city.
// In your deep-copy code, this refers to p1, the original object because The clone() method is executing on p1.