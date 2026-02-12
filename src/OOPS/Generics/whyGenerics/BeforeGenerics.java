package OOPS.Generics.whyGenerics;
import java.util.*;

public class BeforeGenerics {

    public static class Box{

        Object item;

        void set(Object item){

            this.item=item;
        }

        Object get(){

            return item;
        }





    }

    public static void main(String[] args) {

        List list = new ArrayList();  // Raw List
        list.add("Tushar");
        list.add(100);   // ❗Mixed types allowed!

        String name = (String) list.get(0);  // OK
     //   String number = (String) list.get(1);  // ❌ RUNTIME ERROR
        System.out.println(name);

        // You can add anything — String, Integer, Double, even Object.
        //Compiler doesn't check for mistakes — Runtime crash!
        //You must manually type-cast ((String)), which is unsafe.



        Box obj=new Box();
        obj.set("Hello");

        String ans=(String) obj.get();
        System.out.println(ans);




    }
}







