package OOPS.FunctionalInterface.Variations;

// 8. Functional Interface with Overridden Object Methods

interface Tester {
    void test();
}

public class Type7 {

    public static void main(String[] args) {

        Tester t=new Tester() {
            @Override
            public void test() {
                System.out.println("Testing");
            }

            public String toString() {
                return "Custom toString()";
            }
        };


        t.test();
        System.out.println(t);






    }
}
