package OopsByKK.Generics.GenericInterface;

interface Container<T>{

    void set(T item);
    T get();
}

public class GenericContainer<T> implements Container<T> {

    private T item;

    @Override
    public void set(T item) {
        this.item=item;
    }

    public T get(){
        return item;
    }

    public static void main(String[] args) {

        Container<String> obj=new GenericContainer<>();
        obj.set("Hello");
        System.out.println(obj.get());

        Container<Integer> ob=new GenericContainer<>();
        ob.set(100);
        System.out.println(ob.get());




    }
}
