package ArraysbyKK.strivers;

import java.util.ArrayList;
import java.util.Arrays;

public class Q16 {

    static ArrayList<Integer> leader(int[] arr){

       // Time Complexity: O(n)
      //  Space Complexity: O(n)

        ArrayList<Integer> list=new ArrayList<>();

        int max=Integer.MIN_VALUE;

        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]>max){
                max=arr[i];
                list.add(arr[i]);

            }
        }

        return list;


    }

    public static void main(String[] args) {

        // Leaders in an array

        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> ans=leader(arr);
        System.out.println(ans);
    }
}
