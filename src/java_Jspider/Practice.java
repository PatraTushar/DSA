package java_Jspider;


import java.util.Comparator;
import java.util.TreeSet;

class MyClass implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return o1.compareTo(o2);
    }
}

public class Practice {


    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(20);


        System.out.println(treeSet);

    }
}
