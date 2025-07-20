package OopsByKK.Generics.GenericInterface.variationsof_T_extend_Type;

public class Class_InterfaceBound {
}


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

}

interface RunnableAnimal{

    void run();
}


interface Runner<T extends  Animal & RunnableAnimal>{

    void execute(T animal);
}

class Dog extends Animal implements RunnableAnimal{

    public void run() { System.out.println("Dog is running"); }




}


class DogRunner implements Runner<Dog>{

    public void execute(Dog dog){
        dog.eat();
        dog.run();
    }
}

 class Main3{

     public static void main(String[] args) {

         Dog dog = new Dog();
         Runner<Dog> runner = new DogRunner();
         runner.execute(dog);


     }

}

