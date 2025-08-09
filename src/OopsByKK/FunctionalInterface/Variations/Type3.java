package OopsByKK.FunctionalInterface.Variations;

// 3. Functional Interface with Static Method Returning an Anonymous Class

interface Calculator3 {
    int add(int a, int b);
}
public class Type3 {

    public static Calculator3 getCalculator(){

        return new Calculator3() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
    }

    public static void main(String[] args) {


        Calculator3 cal=getCalculator();
        System.out.println(cal.add(1000,2000));

    }
}
