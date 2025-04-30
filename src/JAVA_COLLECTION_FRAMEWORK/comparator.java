package JAVA_COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Animal {

    int age;
    String name;
    int weight;

    Animal(int age,String name,int weight){

        this.age=age;
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }




}
public class comparator {

    public static void main(String[] args) {

        Animal a1=new Animal(4,"Leo",10);
        Animal a2=new Animal(2,"Bruno",30);
        Animal a3=new Animal(1,"Max",11);
        Animal a4=new Animal(3,"Don",20);

        List<Animal> dog=new ArrayList<>();
        dog.add(a1);
        dog.add(a2);
        dog.add(a3);
        dog.add(a4);

        System.out.println(dog);

        //System.out.println(dog) tries to print the List.
        //ArrayList internally calls toString() method on each element in the list.
        //Your Animal class has overridden toString(), so for each animal it prints nicely!


    //    Collections.sort(dog);







    }
}
