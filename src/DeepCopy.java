

class Address {

    String city;

    Address(String city) {

        this.city = city;
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
        Person cloned = (Person) super.clone();
        cloned.address = new Address(this.address.city);
        return cloned;


    }

    public String toString() {

        return " name-> " + name + " age-> " + age + " address-> " + address.city;
    }
}


public class DeepCopy {


    public static void main(String[] args) throws Exception {

        Address a1 = new Address("uk");

        Person p1 = new Person("raj", 20, a1);
        Person p2 = (Person) p1.clone();

        System.out.println(p1);
        System.out.println(p2);

        p2.address.city = "new York";
        System.out.println(p1);
        System.out.println(p2);


    }
}


// this.address.city means: Go to the current Person object's address, then access its city.
// In your deep-copy code, this refers to p1, the original object because The clone() method is executing on p1.