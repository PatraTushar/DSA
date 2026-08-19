package HEAPS.InterviewQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q3 {

    static int minStoneSum(int[] piles, int k) {

        // Time Complexity:O(n + klogn)
        // Space Complexity:O(n)

        int n = piles.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < n; i++) {

            maxHeap.add(piles[i]);
            sum += piles[i];
        }


        for (int i = 1; i <= k; i++) {

            int curr = maxHeap.poll();
            int remove=curr/2;
            sum-=remove;
            int remaining=curr-remove;
            maxHeap.add(remaining);
        }


        return sum;

    }


    public static void main(String[] args) {

        // leeTCode->1962

        int[] pile = {5, 4, 9};
        int k = 2;
        System.out.println(minStoneSum(pile, k));
    }
}
