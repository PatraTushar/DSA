package HEAPS.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class Q5 {

    static int lastStoneWeight(int[] stones) {

        // BRUTEFORCE APPROACH

        // Time Complexity:O(n + klogn)
        // Space Complexity:O(n)

        int n = stones.length;

        while (n > 1) {

            Arrays.sort(stones);

            // Get the two heaviest stones
            int ele1 = stones[n - 1];
            int ele2 = stones[n - 2];

            // Create a new array after removing both stones
            int[] newStones = new int[n - 1];


            // Copy all elements except the two heaviest
            for (int i = 0; i < n - 2; i++) {

                newStones[i] = stones[i];
            }

            // Add the difference
            newStones[n - 2] = Math.abs(ele1 - ele2);

            stones = newStones;
        }

        return stones[0];


    }


    static int lastStoneWeightI(int[] stones) {

        // Time Complexity:O(n logn)
        // Space Complexity:O(n)

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.add(stone);
        }


        while (maxHeap.size() > 1) {

            int ele1=maxHeap.poll();
            int ele2=maxHeap.poll();

            if (ele1!=ele2){

                maxHeap.add(Math.abs(ele1-ele2));
            }
        }

        if (!maxHeap.isEmpty()) return maxHeap.peek();

        return 0;


    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
        lastStoneWeightI(stones);
    }
}
