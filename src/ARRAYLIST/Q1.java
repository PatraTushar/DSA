package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {

    static void reverseList(ArrayList<Integer> list){

        int i=0,j= list.size()-1;

        while(i<j){

//            int temp=a;
//            a=b;
//            b=temp;
//
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        //reverse an given arraylist

        //input-[0,10,3,5,22,10]      //output-[10,22,5,3,10,0]

        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println(" original list " +list);
      //  reverseList(list);
        Collections.reverse(list);
        System.out.println(" reverse list " +list);
        Collections.sort(list);
        System.out.println(" ascending order " +list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(" descending order " +list);



    }
}
