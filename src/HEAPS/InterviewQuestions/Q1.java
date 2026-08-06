package HEAPS.InterviewQuestions;

import java.util.PriorityQueue;

public class Q1 {


    static class MedianFinder {

        // Max Heap
        PriorityQueue<Integer> left;

        // Min Heap
        PriorityQueue<Integer> right;

        public MedianFinder() {
            left = new PriorityQueue<>((a, b) -> b - a);
            right = new PriorityQueue<>();
        }

        public void addNum(int num) {

        }

        public double findMedian() {
            return 0.0;
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
