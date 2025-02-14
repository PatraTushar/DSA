package OopsByKK.Interfaces.ExtendingInterfaces.SingleInterfaceInheritance;

interface Animal{
    void makeSound(); // abstract method

}

interface pet extends Animal{
    void play();  // new method added
}

// concrete class implementing the extended interface
public class Dog implements pet {

    // implementing method from Animal interface
    public void makeSound(){
        System.out.println("Dog barks: Woof! Woof! ");
    }


    // Implementing method from Pet interface
    public void play(){
        System.out.println("Dog plays by fetching the ball!");
    }

    public static void main(String[] args) {

        Dog obj=new Dog();
        obj.makeSound();
        obj.play();


    }
}
