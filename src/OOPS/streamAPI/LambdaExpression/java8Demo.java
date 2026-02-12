package OOPS.streamAPI.LambdaExpression;

public class java8Demo {

    @FunctionalInterface
    interface MathOperation {

        int operate(int a, int b);


    }

    // without lambda expression

  static class Math implements MathOperation {



        public int operate(int a, int b) {
            return a + b;
        }

    }

    public static void main(String[] args) {

        //java8-->minimal code ,functional Programming
        //java8-->lambda expression,Stream,Date & Time API

        //lambda expression-> it is a anonymous function which have no name,no access modifier,no returnType


        Thread t1 = new Thread(() -> System.out.println(" hello world "));
        // without lambda expression
//        Math obj = new Math();
//        System.out.println(obj.operate(90,40));

        MathOperation sum=(a,b)-> a+b;
        int res=sum.operate(100,200);
        System.out.println(res);


        //  internally--> MathOperation sum=(a,b)->a+b;-->   MathOperation sum = new MathOperation() {
        //    @Override
        //    public int operate(int a, int b) {
        //        return a + b;
        //    }
        //};

        MathOperation subtraction=(a,b)->a-b;
        int res1=subtraction.operate(90,50);
        System.out.println(res1);


    }
}
