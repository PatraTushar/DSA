package DSAPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q66 {

    static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {

            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        ;

        List<int[]> result = new ArrayList<>();


        for (int[] interval : intervals) {

            if (result.isEmpty() || interval[0] > result.get(result.size() - 1)[1]) {

                result.add(interval);

            } else {

                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);

    }


    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
        int[][] ans = merge(intervals);
        System.out.println(Arrays.deepToString(ans));

    }
}
