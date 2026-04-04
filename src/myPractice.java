
class Animal {

    public void eat() {

        System.out.println(" Animal is eating ");
    }
}

interface Runnable {

    void run();


}


interface Soundable {

    void makeSound();
}


class cat extends Animal implements Runnable, Soundable {

    @Override
    public void run() {
        System.out.println(" Dog is running ");
    }

    @Override
    public void makeSound() {

        System.out.println(" Dog is making sound ");
    }
}


  class interfaceBound {

    public <T extends Animal & Runnable & Soundable> void act(T obj) {

        obj.eat();
        obj.run();
        obj.makeSound();


    }
}


public class myPractice {


    public static void main(String[] args) {

        interfaceBound obj=new interfaceBound();
        obj.act(new cat());
    }

}





