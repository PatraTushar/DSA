package OOPS.Interfaces.java8.defaultMethodInInterface;


interface Animal{
    void eat();    // abstract method(old feature)

    // default method with a body(new in java 8)

    default void sleep(){
        System.out.println(" sleeping ");
    }
}

class Dog implements Animal{

    public void eat(){    // implementing abstract method
        System.out.println(" Dog is eating  ");

    }

    // you can override the default method also

//    public void sleep(){
//        System.out.println(" overridden sleeping ");
//    }
}
public class defaultMethodInInterface {

    public static void main(String[] args) {

        Dog obj=new Dog();
        obj.eat();
        obj.sleep();

    }
}
