package OopsByKK.Generics.GenericInterface.variationsof_T_extend_Type;

public class GenericClassImplementsGenericInterface {
}

interface Calculator<T extends Number>{

    T add(T a,T b);
}

class GenericCalculator<T extends Number> implements Calculator<T>{

    public T add(T a,T b){

        System.out.println("Returning first number (dummy add)");
        return a;


    }
}

class Main6{

    public static void main(String[] args) {

        Calculator<Integer> calc=new GenericCalculator<>();
        System.out.println("Result: " + calc.add(5, 10));

    }
}
