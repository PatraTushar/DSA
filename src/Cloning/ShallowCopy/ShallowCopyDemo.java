package Cloning.ShallowCopy;

class Address{
    String city;

    Address(String city){
        this.city=city;
    }
}

class Person implements Cloneable{

    String name;
    int age;
    Address address; //Reference type

    Person(String name,int age,Address address){

        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // performs a shallow copy
    }



    void display(){

        System.out.println("Name: " + name + ", Age: " + age + ", City: " + address.city);
    }
}
public class ShallowCopyDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address addr = new Address("New York");
        Person p1 = new Person("John", 25, addr);

        Person p2 = (Person) p1.clone(); // Cloning

        p2.address.city="england";



        p1.display();
        p2.display();

        System.out.println("\nModifying cloned object’s address...");
        p2.address.city = "Los Angeles"; // Changing city in cloned object

        p1.display();
        p2.display();

    }




}
