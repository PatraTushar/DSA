package OOPS.AnonymousInnerClass;

// Step 1: Define an interface
interface calculator {
    int add(int a, int b); // abstract method
}

public class Demo1 {

    // Step 2: Method that returns calculator type
    static calculator getCalculator(){

        // Step 3: Create anonymous inner class implementing calculator
        // Compiler internally creates something like: Demo1$1.class
        return new calculator() {

            // Step 4: Provide implementation of add()
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        }; // Step 5: Object of anonymous class is created and returned
    }

    public static void main(String[] args) {

        // Step 6: Call getCalculator()
        // → Anonymous class object is created
        // → Reference stored in 'cal' (type = calculator)
        calculator cal = getCalculator();

        // Step 7: Method call using interface reference
        // → JVM checks actual object (anonymous class)
        // → Calls overridden add() method
        int result = cal.add(10, 20);

        // Step 8: Print result
        System.out.println(result); // Output: 30
    }
}