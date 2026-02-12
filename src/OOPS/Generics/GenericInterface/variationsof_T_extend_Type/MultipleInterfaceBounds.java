package OOPS.Generics.GenericInterface.variationsof_T_extend_Type;

public class MultipleInterfaceBounds {

}

interface A {
    void showA();
}

interface B {
    void showB();
}


interface Processor<T extends A & B> {

    void process(T input);

}

class MyProcessor implements A,B{

    public void showA() { System.out.println("Inside A"); }
    public void showB() { System.out.println("Inside B"); }


}

class ProcessorImpl implements Processor<MyProcessor>{

    public void process(MyProcessor input){

        input.showA();
        input.showB();

    }
}

class Main2{

    public static void main(String[] args) {

        MyProcessor obj = new MyProcessor();
        Processor<MyProcessor> processor = new ProcessorImpl();
        processor.process(obj);


    }


}


