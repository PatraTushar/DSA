package OOPS.Generics.GenericInterface.variationsof_T_extend_Type;

public class GenericMethodInsideGenericInterface {
}

interface Tool<T> {

    <U extends Number> void use(U input);

}

class ToolImpl implements Tool<String> {
    public <U extends Number> void use(U input) {
        System.out.println("Using with number: " + input);
    }
}

class Main7 {
    public static void main(String[] args) {
        Tool<String> tool = new ToolImpl();
        tool.use(42);        // Integer
        tool.use(3.14f);     // Float
    }
}
