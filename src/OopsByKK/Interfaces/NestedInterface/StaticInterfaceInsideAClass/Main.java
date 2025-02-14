package OopsByKK.Interfaces.NestedInterface.StaticInterfaceInsideAClass;


class outer{

    // static interface inside a class
    public interface NestedInterface{

        void display();

    }
}

class implementer implements outer.NestedInterface{

    public void display(){
        System.out.println("Implemented Nested Interface inside a class");
    }
}
public class Main {

    public static void main(String[] args) {

        implementer obj=new implementer();
        obj.display();

    }
}
