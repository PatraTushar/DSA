package OopsByKK.Cloning.ShallowCopy;


class Address {
    String city;

    Address(String address) {

        this.city = address;
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
        return super.clone();  // Shallow copy
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + address.city);
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException { // Exception handled here

        Address obj = new Address("UK");
        Person obj2 = new Person("john", 14, obj);
        Person obj3 = (Person) obj2.clone();  // Cloning obj2

        obj3.address.city = "USA";  // Changing obj3's city

        obj2.display(); // Will print "USA" due to shallow copy
        obj3.display(); // Will also print "USA"
    }
}

