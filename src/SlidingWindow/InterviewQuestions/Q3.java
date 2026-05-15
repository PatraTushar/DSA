package SlidingWindow.InterviewQuestions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q3 {

    static List<Integer> findNegativeInWindow(int[] arr, int k) {

        // Time Complexity: O(n)
        // Space Complexity: O(n-k+1)


        int n = arr.length;
        int left = 0;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int right = 0; right < n; right++) {

            if (arr[right] < 0) dq.add(arr[right]);

            if (right - left + 1 == k) {

                if (dq.isEmpty()) result.add(0);
                else result.add(dq.getFirst());


                if (arr[left] < 0) dq.removeFirst();
                left++;
            }
        }

        return result;

    }


    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 0};
        int k = 2;
        List<Integer> result = findNegativeInWindow(arr, k);
        System.out.println(result);

    }
}
