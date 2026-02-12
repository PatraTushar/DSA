package ARRAYS.strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14 {

    static int[] rearrange(int[] arr) {

        //   Time Complexity: O(n)
        // Space Complexity: O(n)

        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int ele : arr) {

            if (ele > 0) positives.add(ele);
            else negatives.add(ele);

        }

        int m = positives.size();
        int n = negatives.size();
        int[] result = new int[m + n];


        int i = 0;
        int j = 0;
        int k = 0;


        while (i < m && j < n) {

            result[k++] = positives.get(i);
            result[k++] = negatives.get(j);

            i++;
            j++;


        }


        while (i < positives.size()) {


            result[k++] = positives.get(i);
            i++;
        }


        while (j < negatives.size()) {

            result[k++] = negatives.get(j);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        // Rearrange array elements by sign but there is no equal number of positives and negatives

        int[] arr = {-1, 2, 3, 4, -3, 1};
        int[] ans = rearrange(arr);
        System.out.println(Arrays.toString(ans));

    }
}
