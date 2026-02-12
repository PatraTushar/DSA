package ARRAYS.strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q32 {


    static int[][] merge(int[][] intervals) {

        // Time Complexity (TC): O(n log n)
        //Space Complexity (SC): O(n)

        int n = intervals.length;

        if (n <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> {

            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });


        List<int[]> merge = new ArrayList<>();

        for (int[] interval : intervals) {

            if (merge.isEmpty() || interval[0] > merge.get(merge.size() - 1)[1]) {

                merge.add(interval);


            } else {

                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1)[1], interval[1]);
            }

        }

        return merge.toArray(new int[merge.size()][]);              // This converts that List of arrays into an array of arrays.




    }

    public static void main(String[] args) {

        // merge overlapping intervals (leeTCode->56)

        int[][] intervals = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
       int[][] ans= merge(intervals);
        System.out.println(Arrays.deepToString(ans));


    }
}
