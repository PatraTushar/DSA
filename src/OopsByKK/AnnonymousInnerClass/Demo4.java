package OopsByKK.AnnonymousInnerClass;


// Anonymous Inner Class with Generics

interface Box<T>{
    T get();
}
public class Demo4 {

    public static void main(String[] args) {

        Box<String> obj=new Box<String>() {
            @Override
            public String get() {
                return "Hello Generics";
            }
        };

        System.out.println(obj.get());




    }
}
