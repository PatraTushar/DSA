package OOPS.Generics.GenricClass;

public class Box<T> {

    T value;

    void set(T value){

        this.value=value;
    }

    T get(){

        return value;
    }


    public static void main(String[] args) {

        //  Example 1: Single Type Parameter

        Box<String> obj=new Box<>();
        obj.set(" Generics are powerful ");
        System.out.println(obj.get());


        Box<Integer> obj2=new Box<>();
        obj2.set(100);
        System.out.println(obj2.get());

        //Java does not create a separate class for String. Instead:
        //
        //It replaces T with String in the compiled .class file.
        //
        //This is called Type Erasure (we'll go deep into this later).


    }
}
