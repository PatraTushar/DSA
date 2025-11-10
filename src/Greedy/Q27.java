package Greedy;

import java.util.*;

public class Q27 {

    static int findLeastNumberOfUniqueInts(int[] arr, int k) {

        //  Time Complexity: O(n) + O(u) + O(u log u) + O(u)      u->unique elements
        //  Space Complexity: O(u) + O(u)

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> freqList = new ArrayList<>(map.values());


        Collections.sort(freqList);

        int removed = 0;

        for (int freq : freqList) {

            if (k >= freq) {

                k -= freq;
                removed++;
            } else return freqList.size() - removed;
        }

        return 0;


    }

    public static void main(String[] args) {

        // leeTCode->1481

        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        int k = 3;
        System.out.println(findLeastNumberOfUniqueInts(arr, k));
    }
}
