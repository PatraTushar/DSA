import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {


    public static class selfPractice<T>{

        // Write a generic method printArray() that takes any type of array and prints all its elements.

        public static <T> void printArr(T[] arr){

            for(T ele:arr) System.out.print(ele+" ");
            System.out.println();
        }

           //  Print First Element

        public static <T> void printFirstEle(T[] arr){

          if(arr.length>0 && arr[0]!=null) System.out.println(arr[0]);
          else System.out.println(" Array is empty ");

        }

        // getLastElement() — Return Last Element

        public static <T> T getLastElement(T[] arr){

            if(arr==null) return null;

            int n=arr.length;

            return arr[n-1];




        }

        // swapElements() — Swap Two Elements in an Array

        public static <T> void swap(T[] arr,int left,int right){

            T temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }


        // arrayToList() — Convert Array to List


        public static <T> void arrayToList(T[] arr){

            List<T> list=new ArrayList<>();

            for(T ele:arr){
                list.add(ele);
            }

            System.out.println(list);


        }




    }

    public static void main(String[] args) {

        Integer[] num={1,2,3,4,5};
        String[]  str={"kunal","raj","siraj","bumrah","shami"};

        selfPractice.printArr(num);
        selfPractice.printArr(str);
        selfPractice.printFirstEle(num);
        selfPractice.printFirstEle(str);
        System.out.println(selfPractice.getLastElement(num));
        System.out.println(selfPractice.getLastElement(str));
        Integer[] num1={10,20,30,40,50};
        selfPractice.swap(num1,1,3);
        System.out.println(Arrays.toString(num1));
        selfPractice.arrayToList(num);
        selfPractice.arrayToList(str);




    }


}

