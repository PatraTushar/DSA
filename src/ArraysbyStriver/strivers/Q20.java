package ArraysbyStriver.strivers;

import java.util.*;

public class Q20 {


    static List<List<Integer>> threeSum(int[] arr) {

        //   Time Complexity (TC): O(n log n + n^2)=O(n^2)
        //  Space Complexity (SC): O(k)

        Arrays.sort(arr);

        int n = arr.length;


        int i = 0;

        List<List<Integer>> result = new ArrayList<>();

        if (n < 3) return result;


        while (i < n - 2) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {

                    j++;
                } else if (sum > 0) {

                    k--;
                } else {

                    List<Integer> triplets = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(triplets);

                    int eleJ = arr[j];
                    int eleK = arr[k];

                    while (j < k && arr[j] == eleJ) j++;
                    while (j < k && arr[k] == eleK) k--;
                }
            }

            int eleI = arr[i];
            while (i < j && eleI == arr[i]) i++;


        }

        return result;


    }

    public static void main(String[] args) {

        // 3 sum (leeTCode->15)

        int[] arr = {-1, 0, 1, 2, -1, 4};
        int[] arr1 = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        List<List<Integer>> ans = threeSum(arr1);
        System.out.println(ans);
    }
}
