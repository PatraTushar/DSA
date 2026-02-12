package OOPS.AnonymousInnerClass;


// Extending a Concrete Class

class car{

    void drive(){

        System.out.println(" Driving a car ");
    }
}


public class ExtendingAConcreteClass {

    public static void main(String[] args) {

        car myCar=new car(){

            @Override
            void drive() {
                System.out.println(" Driving a sport car ");
            }
        };

        myCar.drive();



    }
}
