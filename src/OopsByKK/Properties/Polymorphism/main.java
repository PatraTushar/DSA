package OopsByKK.Properties.Polymorphism;


class Shapes{
    void Area(){

        System.out.println(" it has area   ");
       System.out.println(" i am in area class ");

    }
}

class Triangle extends Shapes{

  //  @Override  // This is called annotation
    void Area(){
        System.out.println(" area is 0.5 * b * h ");
    }
}

class Circle extends Shapes{

    void Area(){
        System.out.println(" area is pie * r * r ");
    }

}

class Square extends Shapes{

    void Area(){

        System.out.println(" Area is side * side ");
        System.out.println(" i am in square class ");
    }
}

public class main {

    public static void main(String[] args) {

        Shapes obj=new Shapes();
        obj.Area();
        Triangle obj2=new Triangle();
        // here child method overriding the parent method

        obj2.Area();   // Dynamic Polymorphism


        // here which method will access depends on the object type
        Shapes obj3=new Circle();
        obj3.Area();


    }
}
