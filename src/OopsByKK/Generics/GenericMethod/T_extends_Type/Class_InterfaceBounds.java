package OopsByKK.Generics.GenericMethod.T_extends_Type;


class Animal{

    void eat() {
        System.out.println("Animal is eating...");
    }

}

interface Runnable{

    void run();

}

interface Soundable{

    void makeSound();


}
public class Class_InterfaceBounds {


    public static class Demo{

        public <T extends Animal & Runnable & Soundable> void act(T obj){

            obj.eat();
            obj.run();
            obj.makeSound();


        }
    }



    public static void main(String[] args) {

        class Dog extends Animal implements Runnable,Soundable{

            public void run() {
                System.out.println("Dog is running...");
            }
            public void makeSound() {
                System.out.println("Dog barks...");
            }


        }

        Demo obj=new Demo();
        obj.act(new Dog());




    }
}
