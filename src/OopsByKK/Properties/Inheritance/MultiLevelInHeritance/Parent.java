package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class Parent {


    String parentName;

    Parent() {
        this.parentName = "Default Parent";
    }

    Parent(String name) {
        this.parentName = name;
    }

    Parent(Parent other) {
        this.parentName = other.parentName;
    }

    void parentMethod() {
        System.out.println("This is Parent: " + parentName);
    }



}
