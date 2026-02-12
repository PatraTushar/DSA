package OOPS.Interfaces.java9;

interface Animal{

    void eat();  //abstract method

    default void sleep(){
        System.out.println(" sleeping ....");
        logAction(); // calling private method
    }

    private void logAction(){
        System.out.println(" logging Action ");
    }
}

class Dog implements Animal{
    public void eat(){
        System.out.println(" Dog is eating ");
    }
}

public class privateMethodInInterface {

    public static void main(String[] args) {

        Dog obj=new Dog();
        obj.eat();
        obj.sleep();

    }
}
