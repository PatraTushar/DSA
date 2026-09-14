package DSAPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56 {

    static List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;


        while (i < n - 2) {


            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) j++;

                else if (sum > 0) k--;

                else {

                    List<Integer> ans = Arrays.asList(arr[i], arr[j], arr[k]);
                    res.add(ans);

                    int eleJ = arr[j];
                    int eleK = arr[k];

                    while (j < k && eleJ == arr[j]) j++;
                    while (j < k && eleK == arr[k]) k--;

                }
            }


            int eleI = arr[i];
            while (i < n - 2 && eleI == arr[i]) i++;


        }

        return res;


    }


    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, 4};
        int[] arr1 = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        List<List<Integer>> ans = threeSum(arr1);
        System.out.println(ans);
    }
}
