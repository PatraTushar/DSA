package HEAPS.InterviewQuestions;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class Q1 {


    static class MedianFinder {

        private PriorityQueue<Integer> leftMaxHeap;
        private PriorityQueue<Integer> rightMinHeap;

        public MedianFinder() {

            leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
            rightMinHeap = new PriorityQueue<>();

        }

        public void addNum(int num) {

            // Time Complexity:O(log n)
            // Space Complexity:O(n)

            if (leftMaxHeap.isEmpty() || num < leftMaxHeap.peek()) leftMaxHeap.add(num);
            else rightMinHeap.add(num);

            if (Math.abs(leftMaxHeap.size() - rightMinHeap.size()) > 1) rightMinHeap.add(leftMaxHeap.poll());
            else if (leftMaxHeap.size() < rightMinHeap.size()) leftMaxHeap.add(rightMinHeap.poll());


        }

        public double findMedian() {

            // Time Complexity:O(1)
            // Space Complexity:O(n)

            if (leftMaxHeap.size() == rightMinHeap.size())
                return (double) (leftMaxHeap.peek() + rightMinHeap.peek()) / 2;

            return leftMaxHeap.peek();
        }
    }

    public static void main(String[] args) {

        // leeTCode->295

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5

        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2.0

    }
}


// Algorithm:
// 1. Maintain two heaps:
//    - leftMaxHeap  -> max heap containing the smaller half.
//    - rightMinHeap -> min heap containing the larger half.
//
// 2. When a number comes:
//    - If left heap is empty or number <= left heap's top,
//      add it to leftMaxHeap.
//    - Otherwise, add it to rightMinHeap.
//
// 3. Balance the heaps:
//    - The size difference should never be more than 1.
//    - If right heap has more elements, move its top to left.
//    - If left heap has more than 1 extra element, move its top to right.
//
// 4. Find median:
//    - If both heaps have equal size,
//      median = (left top + right top) / 2.
//    - Otherwise, median = left heap's top.
//
// Time Complexity:
//    addNum()     -> O(log n)
//    findMedian() -> O(1)
//
// Space Complexity:
//    O(n)