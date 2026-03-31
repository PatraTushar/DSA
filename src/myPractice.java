import java.util.*;

public class myPractice {

    static class myComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {

            return o2.compareTo(o1);
        }
    }


    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new myComparator());
        treeSet.add("z");
        treeSet.add("c");
        treeSet.add("t");
        treeSet.add("a");
        treeSet.add("i");

        System.out.println(treeSet);


    }
}




