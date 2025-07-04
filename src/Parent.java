import java.security.PublicKey;

public class Parent {


    String name;
    int age;

    public Parent(){
        this.name="Unknown";
        this.age=-1;
    }

    public Parent(String name,int age){

        this.name=name;
        this.age=age;
    }


    public Parent(Parent old){

        this.name=old.name;
        this.age=old.age;
    }


    public void display(){

        System.out.println(" name " + name +" : "  +" age " +age);
    }


    public static void info(){

        System.out.println(" It is parent class ");
    }



}

class Child extends Parent{

    String hobby;

    public Child(){

        super();
        this.hobby="None";
    }

    public Child(String name,int age,String hobby){

        super(name,age);
        this.hobby=hobby;
    }

    public Child(Child old){

        super(old);
        this.hobby=old.hobby;
    }


    public void show(){

        super.display();
        System.out.println(" hobby " +hobby);



    }


    public static void main(String[] args) {

        Parent parentRef=new Parent("kunal",12);
        parentRef.display();
        Parent.info();

        Child childRef=new Child();
        childRef.show();
    }
}


