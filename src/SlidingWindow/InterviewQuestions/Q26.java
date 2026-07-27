package SlidingWindow.InterviewQuestions;

import java.util.TreeMap;

public class Q26 {

    static long continuousSubArrays(int[] num) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = num.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        long result = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {


            // Expand the window
            map.put(num[right], map.getOrDefault(num[right], 0) + 1);


            // Window becomes invalid

            while (map.lastKey() - map.firstKey() > 2) {

                map.put(num[left], map.get(num[left])-1);

                if (map.get(num[left])==0) map.remove(num[left]);

                left++;
            }

            result+=right-left+1;


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->2762

        int[] num = {5, 4, 2, 4};
        System.out.println(continuousSubArrays(num));


    }
}
