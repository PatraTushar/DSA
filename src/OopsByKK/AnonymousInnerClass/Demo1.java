package OopsByKK.AnonymousInnerClass;


// Returning an Anonymous Inner Class from a Method

interface calculator{

    int add(int a,int b);
}
public class Demo1 {

    static calculator getCalculator(){

        return new calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
    }

    public static void main(String[] args) {

        calculator cal=getCalculator();
        System.out.println(cal.add(10,20));






    }
}
