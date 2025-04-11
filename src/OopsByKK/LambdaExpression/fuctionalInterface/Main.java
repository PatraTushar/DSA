package OopsByKK.LambdaExpression.fuctionalInterface;

public class Main {

    public static void main(String[] args) {

        // using interface with the help of class

//        MyInter obj=new myInterImplements();
//        obj.sayHello();



        // using interface with anonymous class


//        MyInter a=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is first anonymous class  ");
//            }
//        };
//
//        a.sayHello();
//
//        MyInter b=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println(" This is second anonymous class");
//            }
//        };
//
//        b.sayHello();


        //  using interface with lambda expression

//        MyInter w=()->{
//            System.out.println(" first tym i am using lambda");
//        };
//
//        w.sayHello();
//
//        MyInter H=()->{
//
//            System.out.println(" second  tym i am using lambda ");
//        };
//        H.sayHello();


        sumInter obj2=(a,b)->{
            return a+b;
        };

        System.out.println(obj2.sum(10,20));

        lengthInter k=(str)->{
            return str.length();
        };

        System.out.println(k.getLength("kunal"));

   }
}
