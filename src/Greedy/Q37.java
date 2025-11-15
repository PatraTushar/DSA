package Greedy;

import java.util.List;

public class Q37 {

    static int maxDistance(List<List<Integer>> arrays) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = arrays.size();

        int minimumTillNow = arrays.get(0).get(0);
        int maximumTillNow = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < n; i++) {

            int currMin = arrays.get(i).get(0);
            int currMax = arrays.get(i).get(arrays.get(i).size() - 1);

            maxDistance=Math.max(maxDistance,Math.abs(currMax-minimumTillNow));
            maxDistance=Math.max(maxDistance,Math.abs(maximumTillNow-currMin));

            minimumTillNow=Math.min(minimumTillNow,currMin);
            maximumTillNow=Math.max(maximumTillNow,currMax);
        }

        return maxDistance;


    }

    public static void main(String[] args) {

        // leeTCode->624

        List<List<Integer>> arrays = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(1, 2, 3));
        System.out.println(maxDistance(arrays));


    }
}
