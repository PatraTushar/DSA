import OopsByKK.SingletonClass.Singleton;

import java.util.*;

public class myPractice {


    public static class Wildcards {

        public static void printList(List<?> list) {

            for (Object ele : list) {

                System.out.print(ele + " ");
            }

            System.out.println();
        }

        public static int sumOfNumber(List<? extends Number> list) {


            int sum = 0;

            for (Number ele : list) {

                sum += ele.intValue();

            }

            return sum;


        }

        public static void addInteger(List<? super Integer> list) {

            for (int i = 1; i <= 5; i++) {

                list.add(i);
            }

            System.out.println(list);


        }

        public static <T> void copyList(List<? super T> dest,List<? extends T> src){

            for(T ele:src){

                dest.add(ele);
            }

            System.out.println(dest);
        }

        public static void print(List<? extends Number> list){

            for(Number ele:list){

                System.out.print(ele.doubleValue() +" ");
            }

            System.out.println();



        }
    }

    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<String> list2 = Arrays.asList("a", "b", "c");
        List<Double> list3 = Arrays.asList(1.1, 2.3, 4.5);

        Wildcards.printList(list1);
        Wildcards.printList(list2);
        System.out.println(Wildcards.sumOfNumber(list1));
        System.out.println(Wildcards.sumOfNumber(list3));

        List<Integer> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();
        List<Number> list6 = new ArrayList<>();
        List<Double> list7 = new ArrayList<>();

//        Wildcards.addInteger(list4);
//        Wildcards.addInteger(list5);
//        Wildcards.addInteger(list6);

        Wildcards.copyList(list6,list1);

        Wildcards.print(list1);




    }


}








