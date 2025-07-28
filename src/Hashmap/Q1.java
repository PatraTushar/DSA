package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

    static void HashMapMethods() {

        //Syntax
        Map<String, Integer> mp = new HashMap<>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);


        // Getting Value of a key from the HashMap
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("rahul")); //null

        //Changing/Updating value of a key in the HashMap

        mp.put("Akash", 25); // Akash-->25
        System.out.println(mp.get("Akash")); //25

        //Removing a pair from the Hashmap

        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp);
        System.out.println(mp.remove("Asish")); //null

        //Checking if a key is in the HashMap

        System.out.println(mp.containsKey("riya")); //false
        System.out.println(mp.containsKey("Yash")); //true

        // Adding a new entry only if the key doesn't exist already

        mp.putIfAbsent("Yashika", 30); // it will enter
        mp.putIfAbsent("Yash", 30);  // it will not enter because Yash is already there
        System.out.println(mp);

        // Get all keys in the HashMap

        System.out.println(mp.keySet());

        // Get all values in the HashMap

        System.out.println(mp.values());

        // Get all  entries in the hashMap

        System.out.println(mp.entrySet());

        // traversing all entries of HashMap- multiple methods


        // 1 method
        for (String key : mp.keySet()) {

            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }


        System.out.println();

        // 2 method

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }


    }

    public static void main(String[] args) {

        HashMapMethods();


    }
}
