package OOPS.FunctionalInterface.Variations;

// 2. Functional Interface with Anonymous Inner Class

interface Calculators{

    int add(int a,int b);
}

public class Type2 {

    public static void main(String[] args) {

        Calculators cal=new Calculators() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        System.out.println(cal.add(100,200));


    }
}
