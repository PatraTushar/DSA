package OopsByKK.Generics.Basics;

class Anima<E,V>{

    E name;
    V id;


    Anima(E name,V id){
        this.name=name;
        this.id=id;
    }
}

class Dog<T>{

    T data;

    Dog(T data){
        this.data=data;
    }

    T getData(){
        return data;
    }
}
public class learnGenerics {

    public static void main(String[] args) {
        Dog<String> obj=new Dog<>("hello");
        Dog<Integer> obj2=new Dog<>(10);
        Dog<Float> obj3=new Dog<>(10.5f);
        System.out.println(obj.data  +" " + obj2.data);
        System.out.println(obj3.data);

        System.out.println();

        Anima<String ,Integer> a1=new Anima<>("Leo",123);
        System.out.println(a1.name +" "+ a1.id);

        Anima<Integer,String> a2=new Anima<>(456,"Room");
        System.out.println(a2.name +" "+ a2.id);



    }
}
