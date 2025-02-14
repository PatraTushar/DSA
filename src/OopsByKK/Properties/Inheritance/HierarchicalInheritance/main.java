package OopsByKK.Properties.Inheritance.HierarchicalInheritance;


class Animal {

    void eat() {

        System.out.println(" This animal eat food ");
    }
}

class Dog extends Animal {

    void Bark(){
        System.out.println(" The dog barks ");
    }

}

class cat extends Animal {
    void meow(){
        System.out.println(" the cat meow ");
    }
}

class Elephant extends Animal {
    void trumpet(){
        System.out.println(" The elephant trumpets ");
    }
}

public class main {

    public static void main(String[] args) {

        Animal obj=new Animal();
        obj.eat();

        System.out.println();

        Dog obj2=new Dog();
        obj2.Bark();
        obj2.eat();

        System.out.println();

        cat obj3=new cat();
        obj3.meow();
        obj3.eat();

        System.out.println();

        Elephant obj4=new Elephant();
        obj4.trumpet();
        obj4.eat();


    }



}


