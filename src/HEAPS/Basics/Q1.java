package HEAPS.Basics;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1 {

    static int kthSmallest(int[] arr, int k) {


        //Time Complexity:O(n log k)
        //Space Complexity:O(k)


        //pq.add(ele) → O(log k)
        //pq.remove() → O(log k)

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr) {

            pq.add(ele);

            if (pq.size() > k) pq.remove();
        }

        return pq.peek();


    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 4, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.println(kthSmallest(arr, k));


    }
}
