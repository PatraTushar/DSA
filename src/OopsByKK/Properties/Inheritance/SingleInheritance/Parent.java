package OopsByKK.Properties.Inheritance.SingleInheritance;

public class Parent {

    String name;
    int age;


    // Default constructor
    Parent(){

        this.name="unknown";
        this.age=-1;
    }


    // Parametrized constructor
    Parent(String name,int age){

        this.name=name;
        this.age=age;
    }


    //copy constructor
    Parent(Parent old){
        this.name=old.name;
        this.age=old.age;
    }

    public void display(){

        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void info(){

        System.out.println("Running Parent class");

    }

    public static void main(String[] args) {

    }


}


