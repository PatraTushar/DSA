package OopsByKK.Generics.Basics;

public class objectBoxWithGenerics<T> {

    private T item;

    public void setItem(T item){
        this.item=item;
    }


    public T getItem(){
        return item;
    }



    public static void main(String[] args) {

        // with generics

        objectBoxWithGenerics<String> obj=new objectBoxWithGenerics<>();
        obj.setItem(" hello world ");
        String message=obj.getItem();
        System.out.println(message);




    }
}
