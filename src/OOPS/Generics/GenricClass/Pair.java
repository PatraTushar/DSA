package OOPS.Generics.GenricClass;

public class Pair<T,V> {

    T first;
    V second;

    Pair(T first,V second){

        this.first=first;
        this.second=second;
    }

    void print(){

        System.out.println(" First: " +first);
        System.out.println(" Second: " +second);
    }

    public static void main(String[] args) {

        // Example 2: Multiple Type Parameters

        Pair<String ,Integer> obj=new Pair<>("Tushar",21);
        obj.print();

        Pair<String,String> obj2=new Pair<>("Hello","World");
        obj2.print();
    }
}
