package OopsByKK.Interfaces.Basics;

interface Animal{
    void eat();
    void sleep();
}

class Dog implements Animal{

    public void eat(){

        System.out.println(" Dog is eating ");

    }

   public void sleep(){

       System.out.println(" Dog is sleeping ");

    }
}
public class Main {

    public static void main(String[] args) {

        Dog obj=new Dog();
        obj.eat();
        obj.sleep();

    }
}
