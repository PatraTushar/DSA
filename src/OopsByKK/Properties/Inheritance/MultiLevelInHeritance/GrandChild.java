package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class GrandChild extends Child{

    String grandChildName;

    GrandChild() {
        super(); // call Child()
        this.grandChildName = "Default GrandChild";
    }

    GrandChild(String parentName, String childName, String grandChildName) {
        super(parentName, childName); // call Child(String, String)
        this.grandChildName = grandChildName;
    }

    GrandChild(GrandChild other) {
        super(other); // call Child(Child)
        this.grandChildName = other.grandChildName;
    }

    void grandChildMethod() {
        System.out.println("This is GrandChild: " + grandChildName + ", Child: " + childName + ", Parent: " + parentName);
    }
}
