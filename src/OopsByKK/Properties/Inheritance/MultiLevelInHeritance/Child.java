package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class Child extends Parent {


    String childName;

    Child() {
        super(); // call Parent()
        this.childName = "Default Child";
    }

    Child(String parentName, String childName) {
        super(parentName); // call Parent(String)
        this.childName = childName;
    }

    Child(Child other) {
        super(other); // call Parent(Parent)
        this.childName = other.childName;
    }

    void childMethod() {
        System.out.println("This is Child: " + childName + ", Parent: " + parentName);
    }




}


