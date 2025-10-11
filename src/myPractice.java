import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class myPractice {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int longestSubArrSumK(int[] arr, int k) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == k) {

                maxLength = Math.max(maxLength, i + 1);
            }

            if (map.containsKey(sum - k)) {

                int length = i - map.get(sum - k);
                maxLength = Math.max(length, maxLength);


            }


            map.put(sum, i);


        }

        return maxLength;


    }


    public static void main(String[] args) {

        int[] arr = {3, 1, 1, 1};
        System.out.println(longestSubArrSumK(arr, 3));


    }
}







