package OopsByKK.Generics.GenericMethod;

public class NonGenericClass {

    public <T> void show(T item){

        System.out.println("Item: " + item);

    }

    public static void main(String[] args) {


        // Example 3: Generic Method Inside a Non-Generic Class

        NonGenericClass obj=new NonGenericClass();
        obj.show("I Love Coding");
        obj.show(400);


    }
}
