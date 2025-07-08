package OopsByKK.Generics.GenericInterface.WhenClassImplementsGenericInterface;


interface MyInterface<T>{

    void show(T data);


}

class AnotherClass<X> implements MyInterface<X>{

    // Case 2: Class defines its own generic type parameter (can have a different name)

    public void show(X data){

        System.out.println(data);
    }
}

class concreteClass implements MyInterface<String>{

    // Case 3: Class provides a concrete type to the interface and is not generic itself

    public void show(String data){
        System.out.println(data);
    }
}
public class MyClass<T> implements MyInterface<T> {

    public void show(T data){

        System.out.println(data);

    }

    public static void main(String[] args) {

        //  Case 1: Class defines the same generic type and passes it to the interface

        MyInterface<String> obj=new MyClass<>();
        obj.show(" Hello world ");

        MyInterface<Integer> ob=new MyClass<>();
        ob.show(100);

        MyInterface<Integer> obj2=new AnotherClass<>();
        obj2.show(5000);

        MyInterface<String> ob3=new concreteClass();
        ob3.show(" I Love Coding ");

    }
}
