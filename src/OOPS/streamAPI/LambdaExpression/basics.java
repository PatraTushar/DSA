package OOPS.streamAPI.LambdaExpression;


import java.util.*;
import java.util.stream.Collectors;

public class basics {

    public static void main(String[] args) {

        // Q: create a List and filter all even number from the list

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);
        list.add(99);

        List<Integer> list2=List.of(2,4,50,21,22,67);  // used to add element bt cant modify and add something like list2.add(x).if u have to add then add inside List.of only

        List<Integer> list3=Arrays.asList(23,56,21,98,45); // used to add element bt cant modify and add something like list3.add(x).if u have to add then add inside Arrays.asList only



        // without stream API
        List<Integer> l1=new ArrayList<>();

        for(int a:list){
            if(a%2==0){
                l1.add(a);
            }
        }
    //    System.out.println(l1);

        // using stream API

//        Stream<Integer> st=list.stream();
//        List<Integer> newList=st.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        // using streamAPI in one line
        List<Integer> NewList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(NewList);


        //  Q: create a List and filter all the number greater than 4 from list H

        List<Integer> H=List.of(10,1,3,67,49,78,2);

       List<Integer> l= H.stream().filter(i->i>4).collect(Collectors.toList());
        System.out.println(l);
    }
}
