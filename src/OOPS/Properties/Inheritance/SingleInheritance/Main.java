package OOPS.Properties.Inheritance.SingleInheritance;

public class Main {

    public static void main(String[] args) {

        // ✔ Creating Parent object using parameterized constructor
        Parent parent1 = new Parent("Ramesh", 45);
        parent1.display();

        // ✔ Creating a new Parent object using copy constructor
        Parent parent2 = new Parent(parent1);
        parent2.display();

        // ✔ Static method in parent
        Parent.info();

        System.out.println();

        // ✔ Creating Child object using parameterized constructor
        Child child1 = new Child("Tushar", 21, "Coding");
        child1.show();

        System.out.println();

        // ✔ Parent reference, Child object (upcasting — allowed)
        Parent parentRef = new Child("Raj", 22, "Gaming");
        parentRef.display();  // ✅ Allowed — only parent members accessible
        // parentRef.show();   ❌ Not allowed — 'show()' is only in Child

        System.out.println();

        // ❌ Invalid: Child reference = Parent object (downcasting not allowed)
        // Child child2 = new Parent("Fake", 50);  // ❌ Compile-time error
        // System.out.println(child2.name);

        // ✔ Copy constructor for child
        Child childCopy = new Child(child1);
        childCopy.show();
    }
}
