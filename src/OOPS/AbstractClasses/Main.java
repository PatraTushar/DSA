package OOPS.AbstractClasses;

 abstract class Animal{

     abstract void makeSound();



     void eat(){
         System.out.println(" This animal is eating ");
     }

     static void message(){
         System.out.println(" Hello world ");
     }


}

class Dog extends Animal{

     void makeSound(){
         System.out.println(" Dog barks : woof woof!");
     }


     void eat(){
         super.eat();
     }


}

class  Cat extends Animal{
     void makeSound(){
         System.out.println(" cat meows: meow meow");
     }


    void eat() {
        super.eat();
    }
}
public class Main {

    public static void main(String[] args) {

        Dog obj=new Dog();
        obj.eat();  // when we do check obj.eat() it will first check in the reference type if it does not found the method it will check in the parent class
        obj.makeSound();

        System.out.println();

        Cat obj2=new Cat();
        obj2.eat();
        obj2.makeSound();

        System.out.println();

        Animal.message();

        System.out.println();

        //parent class reference variable having child class object

        Animal obj3=new Dog();
        obj3.makeSound();




    }
}
