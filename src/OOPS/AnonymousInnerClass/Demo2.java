package OOPS.AnonymousInnerClass;

// Step 1: Normal class
class Person {

    void show() {
        System.out.println("Person");
    }
}

public class Demo2 {

    public static void main(String[] args) {

        // Step 2: Anonymous inner class creation
        // → Compiler creates a hidden class like Demo2$1 extends Person
        // → Object of that class is created

        Person p = new Person() {

            // Step 3: Instance variable of anonymous class
            String name = "Tushar";

            // Step 4: Instance initializer block
            // → Executes immediately after object creation
            {
                System.out.println("Anonymous class initialized");
            }

            // Step 5: Method overriding
            @Override
            void show() {
                System.out.println("Name : " + name);
            }
        };

        // Step 6:
        // Order during object creation:
        // 1. Memory allocated in heap
        // 2. Instance variables initialized (name = "Tushar")
        // 3. Instance initializer block executed

        // Step 7: Method call
        // → Reference type = Person
        // → Actual object = anonymous class
        // → Runtime decides which show() to call (dynamic dispatch)

        p.show(); // Calls overridden method

        // Step 8: Output:
        // Anonymous class initialized
        // Name : Tushar
    }
}


// new Person() { ... }

//👉 It is NOT a Person object directly
//👉 It is an object of anonymous inner class (which extends Person)


// internally
//class Demo2$1 extends Person { ... }
//new Demo2$1(); // this object is created