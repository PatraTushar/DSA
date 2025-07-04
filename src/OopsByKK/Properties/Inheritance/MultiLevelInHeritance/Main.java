package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class Main {

    public static void main(String[] args) {

        // ------------------ PARENT OBJECT ------------------
        Parent p1 = new Parent();
        p1.parentMethod();

        Parent p2 = new Parent("Rahul");
        p2.parentMethod();

        Parent p3 = new Parent(p2);
        p3.parentMethod();

        System.out.println();

        // --------- PARENT REFERENCE = CHILD OBJECT ✅ ---------
        Parent ref1 = new Child("Suresh", "Karan");
        ref1.parentMethod();
        // ref1.childMethod(); ❌ not allowed — reference type is Parent
        // ref1.childName ❌ not accessible

        // ------------------ CHILD OBJECT ------------------
        Child c1 = new Child();
        c1.childMethod();

        Child c2 = new Child("Amit", "Rohan");
        c2.childMethod();

        Child c3 = new Child(c2);
        c3.childMethod();

        System.out.println();

        // --------- PARENT REFERENCE = GRANDCHILD OBJECT ✅ ---------
        Parent ref2 = new GrandChild("Vikas", "Arjun", "Yash");
        ref2.parentMethod();
        // ref2.childMethod(); ❌
        // ref2.grandChildMethod(); ❌
        // Only Parent accessible

        // --------- CHILD REFERENCE = GRANDCHILD OBJECT ✅ ---------
        Child ref3 = new GrandChild("Sunil", "Nikhil", "Avi");
        ref3.childMethod();
        // ref3.grandChildMethod(); ❌ not accessible
        // ref3.grandChildName ❌

        // ------------------ GRANDCHILD OBJECT ------------------
        GrandChild g1 = new GrandChild();
        g1.grandChildMethod();

        GrandChild g2 = new GrandChild("Ramesh", "Ravi", "Raj");
        g2.grandChildMethod();

        GrandChild g3 = new GrandChild(g2);
        g3.grandChildMethod();

        System.out.println();

        // --------- INVALID: CHILD REF = PARENT OBJECT ❌ ---------
        // Child c4 = new Parent(); // ❌ Error
        // Because Parent object has no child members

        // --------- INVALID: GRANDCHILD REF = CHILD OBJECT ❌ ---------
        // GrandChild g4 = new Child(); // ❌ Error
        // Because Child object has no grandchild members
    }
    }

