import java.util.*;

public class myPractice {

    static int longestSubArrSumK(int[] arr, int k) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            map.put(right, sum);


            if (map.get(right) == k) {

                maxLength = Math.max(maxLength, right - left + 1);


            }



            maxLength = Math.max(maxLength, right - left + 1);


        }

        return maxLength;


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, -1,2,-1,3};
        System.out.println(longestSubArrSumK(arr, 3));


    }
}








