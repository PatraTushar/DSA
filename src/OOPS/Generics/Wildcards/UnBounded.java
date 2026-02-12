package OOPS.Generics.Wildcards;

import java.util.List;

public class UnBounded {

    public static void printList(List<?> list){

        for(Object ele : list){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {

        List<String> list=List.of("a","b","c");
        List<Integer> list1=List.of(1,2,3);
        printList(list);
        printList(list1);




    }
}
