package JAVA_COLLECTION_FRAMEWORK;

import java.util.HashSet;

public class setInterfaceExample {

    public static void main(String[] args) {

        HashSet<Integer> st=new HashSet<>();

//        st.add(1);
//        st.add(2);
//        st.add(3);
//        System.out.println(st);  //[1,2,3]
//        st.add(1);
//        st.add(2);
//        st.add(3);
//        System.out.println(st);  //[1,2,3]
//        st.remove(2);
//        System.out.println(st); //[1,3]
//        System.out.println(st.contains(2)); //false
//        System.out.println(st.size()); //2


        // unordered

        st.add(10);
        st.add(100);
        st.add(90);
        st.add(1000);
        st.add(15);
        st.add(111);
        System.out.println(st);




    }
}
