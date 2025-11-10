package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q25 {

    static int minTapsOpen(int[] gallery, int n) {


        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (gallery[i] < 0) continue;

            int left = Math.max(0, i - gallery[i]);
            int right = Math.min(n - 1, i + gallery[i]);

            list.add(new int[]{left, right});
        }

        Collections.sort(list, (a, b) -> a[0] - b[0]);


        int rightAreaCovered = -1;
        int tap = 0;
        int farthest = -1;

        for (int[] ele : list) {


            int left = ele[0];
            int right = ele[1];

            farthest = Math.max(farthest, right);


            if (left > rightAreaCovered) {


                tap++;
                rightAreaCovered = farthest;


            }



            if (rightAreaCovered >= n - 1) break;


        }

        if (rightAreaCovered < n - 1) return -1;


        return tap;


    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, -1, 0, 0, 0, 0, 0};
        System.out.println(minTapsOpen(arr, 9));
    }
}
