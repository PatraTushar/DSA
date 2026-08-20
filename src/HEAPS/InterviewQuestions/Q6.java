package HEAPS.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q6 {

    static int[] topFrequent(int[] nums, int k) {

        // Time Complexity:O(n logk)
        // Space Complexity:O(n)


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {

            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int frequency = entry.getValue();

            minHeap.offer(new int[]{ element,frequency});

            if (minHeap.size() > k) minHeap.poll();

        }

        int[] result=new int[k];

        int index=0;
        while (!minHeap.isEmpty()){

            result[index++]=minHeap.poll()[0];
        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->347

        int[] num = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topFrequent(num, k);
        System.out.println(Arrays.toString(result));


    }
}
