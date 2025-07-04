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
        //Yes — when you write super(other), Java checks:
        //What is the type of other?
        //Which class are we calling super() for? → The immediate parent class
        //In that parent class, is there any constructor that accepts a parameter of the parent’s own class type?
        //Then it checks — is other compatible with that parameter? (via inheritance)

        this.childName = other.childName;
    }

    void childMethod() {
        System.out.println("This is Child: " + childName + ", Parent: " + parentName);
    }




}


