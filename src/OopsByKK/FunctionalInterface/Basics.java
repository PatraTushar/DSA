package OopsByKK.FunctionalInterface;


 interface Calculator{

     int add(int a,int b);    // single abstract method

     default void printHello(){

         System.out.println("Hello from Calculator");
     }

     static void staticMethod(){

         System.out.println("Static method in Calculator");
     }

}
public class Basics {

    public static void main(String[] args) {

        Calculator cal=new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        System.out.println(cal.add(10,20));
        cal.printHello();
        Calculator.staticMethod();


    }
}
