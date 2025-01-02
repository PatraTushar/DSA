package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Q2 {

    public static void main(String[] args) {
        //program to sort an Arraylist of strings in descending order

        ArrayList<String> l1=new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("physics");
        l1.add("wallah");
        System.out.println(" original list" +l1);
        Collections.sort(l1);
        System.out.println(" sorted " +l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(" sorted in reverse " +l1);



    }
}
