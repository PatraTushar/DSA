package JAVA_COLLECTION_FRAMEWORK;

import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {

        TreeSet<Integer> st=new TreeSet<>();
        // increasing order
        st.add(10);
        st.add(100);
        st.add(90);
        st.add(1000);
        st.add(15);
        st.add(111);

        System.out.println(st);  // 10, 15, 90, 100, 111, 1000]
        st.remove(90);
        System.out.println(st);  // 10, 15, 100, 111, 1000
        System.out.println(st.contains(15)); // true
    }
}
