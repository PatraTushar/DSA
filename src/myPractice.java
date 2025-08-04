import OopsByKK.SingletonClass.Singleton;

import java.util.*;

public class myPractice {


    public static void printList(List<? extends Number> list) {



        for (Object ele : list) {

            System.out.println(ele);
        }
    }

    public static void main(String[] args) {


        List<Double> list = Arrays.asList(1.2, 3.4, 5.6);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        myPractice.printList(list);
        myPractice.printList(list1);

        List<Integer> list2 = new ArrayList<>();
        myPractice.printList(list2);


    }

}








