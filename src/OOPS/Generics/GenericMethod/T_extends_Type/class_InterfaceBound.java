package OOPS.Generics.GenericMethod.T_extends_Type;

class Animal {

    void dance() {

        System.out.println(" Animal is Dancing ");
    }
}

interface Playable {

    void play();
}


interface Eatable {

    void eat();
}


class Elephant extends Animal implements Playable, Eatable {

    @Override
    public void play() {
        System.out.println(" Elephant  is playing ");
    }

    @Override
    public void eat() {
        System.out.println(" Elephant is eating ");
    }


}


class BoundedTypes {

     <T extends Animal & Playable & Eatable> void act(T obj) {


        obj.dance();
        obj.play();
        obj.eat();


    }

}

public class class_InterfaceBound {

    public static void main(String[] args) {

        BoundedTypes obj=new BoundedTypes();
        obj.act(new Elephant());

    }
}
