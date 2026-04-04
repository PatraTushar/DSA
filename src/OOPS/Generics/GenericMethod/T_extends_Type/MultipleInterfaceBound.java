package OOPS.Generics.GenericMethod.T_extends_Type;

interface Printable {

    void print();
}

interface Showable {

    void show();
}


class Documents implements Printable, Showable {

    public void print() {

        System.out.println("Printing Document");
    }

    public void show() {

        System.out.println("Showing Document");
    }
}


class Demo {

    public <T extends Printable & Showable> void process(T obj) {

        obj.print();
        obj.show();


    }
}

public class MultipleInterfaceBound {


    public static void main(String[] args) {


        Demo d = new Demo();
        d.process(new Documents());


    }
}
