package OOPS.Generics.GenericMethod.T_extends_Type;

interface Printable {

    void print();
}

interface Showable {

    void show();
}

public class MultipleInterfaceBound {

    public static class Demo {

        public <T extends Printable & Showable> void process(T obj) {

            obj.print();
            obj.show();


        }
    }

    public static void main(String[] args) {

        class Documents implements Printable,Showable{

            public void print(){

                System.out.println("Printing Document");
            }

            public void show(){

                System.out.println("Showing Document");
            }
        }


        Demo d=new Demo();
        d.process(new Documents());


    }
}
