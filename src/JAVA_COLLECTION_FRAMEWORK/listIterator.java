package JAVA_COLLECTION_FRAMEWORK;


import java.util.*;

public class listIterator {

    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("grapes");
        for(int i=0;i<fruits.size();i++){
            System.out.println(" fruits are " +fruits.get(i));
        }

        System.out.println();
        for(String a:fruits){
            System.out.println(" fruits is "+a);
        }

        Iterator<String> fI=fruits.iterator();
        while (fI.hasNext()){
            System.out.println(fI.next());
        }
    }
}
