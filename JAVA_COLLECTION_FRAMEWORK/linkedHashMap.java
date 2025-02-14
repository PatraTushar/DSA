package JAVA_COLLECTION_FRAMEWORK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class linkedHashMap {

    public static void main(String[] args) {

        Map<Integer,String> mp=new LinkedHashMap<>();

        mp.put(3,"aman");
        mp.put(1,"rohan");
        mp.put(2,"riya");
        System.out.println(mp);

        TreeMap<Integer,String> tr=new TreeMap<>();
        tr.put(3,"raj");
        tr.put(1,"rajesh");
        tr.put(2,"rahul");
        System.out.println(tr);
    }
}
