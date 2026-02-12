package ARRAYS.strivers;

import java.util.ArrayList;
import java.util.Collections;

public class Q16 {

    static ArrayList<Integer> leader(int[] num){

       // Time Complexity: O(n)
      //  Space Complexity: O(n)

        int n = num.length;

        ArrayList<Integer> result = new ArrayList<>();

        int max = num[n - 1];

        result.add(num[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (num[i] > max) {

                result.add(num[i]);
                max = num[i];
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
