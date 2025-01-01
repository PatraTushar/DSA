package JAVA_COLLECTION_FRAMEWORK;

import java.util.HashMap;
import java.util.Map;

public class mapInterface {

    public static void main(String[] args) {

        Map<Integer,String > mp=new HashMap<>();
        mp.put(3,"rahul");
        mp.put(1,"aman");
        mp.put(2,"rohit");
        mp.putIfAbsent(1,"riya");

        // iterating over keys in a map

        for(Integer i:mp.keySet()){

            System.out.println(i);
        }


        // iterating over values in map

        for(String i:mp.values()){

            System.out.println(i);
        }


        // iterate over key value mapping


        for(var e:mp.entrySet()){

            System.out.println(e);
        }



        System.out.println(mp);
        System.out.println(mp.entrySet());
        System.out.println(mp.get(2)); // rohit
        System.out.println(mp.containsKey(4));   //false
        System.out.println(mp.containsValue("rohit"));  //true
        System.out.println(mp.keySet());
        System.out.println(mp.values());




    }
}
