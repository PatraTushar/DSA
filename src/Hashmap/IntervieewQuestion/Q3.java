package Hashmap.IntervieewQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q3 {


    static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {

            if(mp.containsKey(target-arr[i])){

                return new int[]{mp.get(target-arr[i]),i};
            }

            mp.put(arr[i],i);


        }

        return new int[]{-1,-1};










    }

    public static void main(String[] args) {

        // Two sum

        int[] arr = {10, 12, 10, 15, -1, 7, 6, 4, 2, 1};
        int target = 11;
        int[] Ans=twoSum(arr,target);
        System.out.println(Arrays.toString(Ans));



    }
}
