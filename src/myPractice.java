import java.util.HashMap;

public class myPractice {


    static int countSubArraysLessThanEqualToK(int[] arr, int k) {

        if (k < 0) return 0;

        int n = arr.length;
        int totalSubArrays = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {

                map.put(arr[left], map.get(arr[left])-1);
                if (map.get(arr[left]) == 0) map.remove(arr[left]);
                left++;


            }

            totalSubArrays += (right - left + 1);


        }

        return totalSubArrays;

    }

    static int subArrayWithKDistinct(int[] arr, int k) {

        return countSubArraysLessThanEqualToK(arr, k) - countSubArraysLessThanEqualToK(arr, k - 1);


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int goal = 2;
        System.out.println(subArrayWithKDistinct(arr, goal));


    }


}

