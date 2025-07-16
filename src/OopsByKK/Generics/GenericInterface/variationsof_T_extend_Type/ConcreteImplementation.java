package OopsByKK.Generics.GenericInterface.variationsof_T_extend_Type;

public class ConcreteImplementation {

}


interface Container<T extends Number>{

    void display(T value);
}

class DoubleContainer implements Container<Double>{

    public void display(Double value) {
        System.out.println("Double value: " + value);
    }


}

class Main5{

    public static void main(String[] args) {

        Container<Double> container = new DoubleContainer();
        container.display(99.99);

    }
}
