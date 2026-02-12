package ARRAYS.strivers;

import java.util.ArrayList;
import java.util.Collections;

public class Q16 {

    static ArrayList<Integer> leader(int[] arr){

       // Time Complexity: O(n)
      //  Space Complexity: O(n)

        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        result.add(arr[n - 1]);

        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] >= max) {

                result.add(arr[i]);
                max = arr[i];


            }
        }

        Collections.reverse(result);
        return result;




    }

    public static void main(String[] args) {

        // Leaders in an array

        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> ans=leader(arr);
        System.out.println(ans);
    }
}
