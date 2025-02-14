package practice;



class Human{

    int age;
    String name;
    String address;

    Human(int age,String name,String address){

        this.age=age;
        this.name=name;
        this.address=address;
    }

    Human(Human other){

        this.age=other.age;
        this.name=other.name;
        this.address=other.address;

    }
}
public class Main {


    public static void main(String[] args) {

        Human obj=new Human(10,"kunal","uk");
        Human obj2=new Human(obj);





    }





    }

