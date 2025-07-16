package OopsByKK.Generics.GenericMethod.T_extends_Type;

// Custom Type With Interface Bound
interface Animal{

    void speak();

}

interface RunnableAnimal{

    void run();
}


class Dog implements Animal,RunnableAnimal{

    public void speak(){
        System.out.println(" woof ");
    }

    public void run(){

        System.out.println(" Run fast ");
    }
}
public class Test {

    public <T extends Animal & RunnableAnimal> void play(T animal){

        animal.speak();
        animal.run();
    }

    public static void main(String[] args) {

        new Test().play(new Dog());



    }
}
