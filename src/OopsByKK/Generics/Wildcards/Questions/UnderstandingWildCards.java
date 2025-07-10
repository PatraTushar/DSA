package OopsByKK.Generics.Wildcards.Questions;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingWildCards {

    // Q1-> Write a method printList that accepts any kind of List and prints all elements.
    static void printList(List<?> list){

        System.out.println(list);
    }



    // Q2->Write a method sumNumbers that accepts a list of any type that is a subclass of Number and returns the sum of all elements.
    static void sumOfNumber(List<? extends Number> list){

        double sum=0;
        for(Number ele:list){
            sum+=ele.doubleValue();

        }

        System.out.println(sum);

    }

    // Q3->Write a method addIntegers that accepts a list which can hold Integer or any superclass of Integer, and adds numbers 1 to 5 into it.

    static void addInteger(List<? super Integer> list){


       for(int i=1;i<=5;i++){

           list.add(i);

       }

        System.out.println(list);
    }


    // Q4-> Why can’t you add an element to a List<? extends Number>?
    // Explain with an example.
    static void add(List<? extends Number> list){

//        list.add(100);
//        list.add("raj");

        list.add(null);  // acceptable

       // except null nothing is acceptable

        // ✅ You Can:
        //Pass: List<Number>, List<Integer>, List<Double>, etc.
        //Read: Values as Number
        //Iterate safely

        //❌ You Cannot:
        //Add anything (except null)
        //
        //Because the exact type is unknown, adding breaks type safety


    }


    // Q5->  What is the difference in usage between List<? extends T> and List<? super T> in method parameters?

    static void difference(List<? extends Number> list){

        //Wildcard  	        Meaning  	                         You Can          	You Cannot
        //<? extends T> 	List of an unknown subtype of T         ✅ Read	          ❌ Write (except null)
        //<? super T>	     List of an unknown supertype of T	    ✅ Write	       ❌ Read (only as Object)


        for (Number num : list) {       // ✅ can read as Number
            System.out.println(num);
        }

        // list.add(100); ❌ NOT allowed
        list.add(null);                 // ✅ allowed

    }


    void addIntegers(List<? super Integer> list) {
        list.add(1);    // ✅ safe
        list.add(2);    // ✅ safe

        Object obj = list.get(0); // ✅ can read, but only as Object
        // Integer i = list.get(0); // ❌ NOT allowed directly
    }

    // Q6->Write a method copyList that copies all elements from a source list to a destination list using proper wildcards.







    public static void main(String[] args) {

        List<Integer> list=List.of(100,200,300,400);
        printList(list);
        List<String> list1=List.of("rahul","raj");
        printList(list1);


        List<Number> list2=List.of(10,20,30,40);
        sumOfNumber(list2);
        List<Double> list3=List.of(1.1,2.2,3.3);
        sumOfNumber(list3);

        List<Object> list4=new ArrayList<>();
        addInteger(list4);
        List<Integer> list5=new ArrayList<>();
        addInteger(list5);




    }
}
