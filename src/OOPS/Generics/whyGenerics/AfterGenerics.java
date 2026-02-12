package OOPS.Generics.whyGenerics;

import java.util.*;

public class AfterGenerics {

    public static class Box<T>{

        T item;

        void set(T item){

            this.item=item;
        }

        T get(){

            return item;

        }

    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();  // ✅ Type-safe

        list.add("Tushar");
        // list.add(100);  // ❌ Compile-time error!

        String name = list.get(0);  // ✅ No type-cast needed
        System.out.println(name);


        Box<String> obj=new Box<>();
        obj.set(" Hello ");
        System.out.println(obj.get());


    }
}




