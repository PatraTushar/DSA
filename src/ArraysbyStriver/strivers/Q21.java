package ArraysbyStriver.strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21 {

    static List<List<Integer>> fourSum(int[] arr, int target) {

        //Time Complexity (TC): O(n log n + n³) = O(n³)
        //Space Complexity (SC):
        //O(1) (excluding the space used for the output list)
        //O(k) where k is the number of quadruplets in the result.

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);


        int n = arr.length;

        if (n < 4) return result;

        int i = 0;


        while (i < n - 3) {

            int j = i + 1;

            while (j < n - 2) {

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum < target) {

                        k++;
                    } else if (sum > target) {

                        l--;
                    } else {

                        List<Integer> quadruplets = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        result.add(quadruplets);


                        int eleK = arr[k];
                        int eleL = arr[l];

                        while (k < l && eleK == arr[k]) k++;
                        while (k < l && eleL == arr[l]) l--;

                    }

                }

                int eleJ = arr[j];
                while (j < n - 2 && eleJ == arr[j]) j++;


            }

            int eleI = arr[i];
            while (i < n - 3 && eleI == arr[i]) i++;
        }

        return result;


    }

    public static void main(String[] args) {

        // 4 sum (leeTCode->18)

        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = fourSum(arr, target);
        System.out.println(ans);

    }
}
