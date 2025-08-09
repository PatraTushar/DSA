package OopsByKK.FunctionalInterface.Variations;

// Functional Interface Extending Another Interface

interface Printer{

    void print(String message);
}

@FunctionalInterface
interface AdvancedPrinter extends Printer{

     // no new abstract method here, so still functional interface
}
public class Type5 {

    public static void main(String[] args) {

        AdvancedPrinter p=new AdvancedPrinter() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };

        p.print(" HELLO WORLD ");


    }
}
