package OopsByKK.FunctionalInterface.Variations;

// 1. Functional Interface with a Concrete Class

interface Calculator{

    int add(int a,int b);
}
public class Type1 {

    public static class CalculatorImpl implements Calculator{

        @Override
        public int add(int a, int b) {
            return a+b;
        }
    }

    public static void main(String[] args) {

        Calculator cal=new CalculatorImpl();
        System.out.println(cal.add(10,20));




    }
}
