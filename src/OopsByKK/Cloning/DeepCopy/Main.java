package OopsByKK.Cloning.DeepCopy;



class Address implements Cloneable {  // Step 2: Implement Cloneable in Address
    String city;

    Address(String address) {
        this.city = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city); // Step 2: Return a new Address object
    }
}

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
        // Step 1: Create a new Person instance and copy values manually
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = (Address) this.address.clone(); // Step 1: Deep copy of Address
        return clonedPerson;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + address.city);
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address obj = new Address("UK");
        Person obj2 = new Person("John", 14, obj);
        Person obj3 = (Person) obj2.clone();  // Cloning obj2 with Deep Copy

        obj3.address.city = "USA";  // Changing obj3's city

        obj2.display(); // Prints "UK" (unchanged)
        obj3.display(); // Prints "USA" (only changed in obj3)
    }
}

