package OOPS.Generics.Wildcards;

import java.util.List;
import java.util.Objects;

public class whyWildCards {

    public static void printList(List<Objects> list){

        for(Object ele:list){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {


        List<String> obj=List.of("a","b");
      //  printList(obj);     // compile-time error(Even though String is a subclass of Object, List<String> is not a subclass of List<Object>.)

    }
}
