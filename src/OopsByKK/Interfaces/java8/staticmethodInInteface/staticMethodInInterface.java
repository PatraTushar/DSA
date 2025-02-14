package OopsByKK.Interfaces.java8.staticmethodInInteface;


interface Animal{
    //static methods belongs to the interface not the implementing class
    static void sound(){
        System.out.println(" Animal makes sound ");
    }
}

public class staticMethodInInterface {

    public static void main(String[] args) {

        Animal.sound();

    }
}
