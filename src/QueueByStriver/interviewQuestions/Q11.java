package QueueByStriver.interviewQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q11 {


    // BruteForce Approach
    static List<List<Integer>> printWindowOfSizeK(int[] arr, int k) {

        // Time Complexity: O(n^2)
        //Space Complexity: O(1)

        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            List<Integer> ans = new ArrayList<>();

            for (int j = i; j < k + i; j++) {

                ans.add(arr[j]);


            }

            result.add(ans);

        }

        return result;
    }


    static List<Integer> display(Queue<Integer> q, int k) {

        // Time Complexity: O(n * k)
        //Space Complexity: O(n * k)


        List<Integer> ans = new ArrayList<>();

        while (k > 0) {

            int val = q.peek();
            ans.add(val);
            q.add(q.remove());
            k--;
        }

        return ans;
    }


    static List<List<Integer>> printWindowOfSizeKI(int[] arr, int k) {

        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < k - 1; i++) {

            q.add(arr[i]);

        }


        for (int j = k - 1; j < n; j++) {

            q.add(arr[j]);

            List<Integer> queue = display(q, k);

            q.poll();

            result.add(queue);


        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 7, 8, 1};
        int k = 3;
        List<List<Integer>> ans = printWindowOfSizeK(arr, k);
        System.out.println(ans);
        List<List<Integer>> ans1 = printWindowOfSizeKI(arr, k);
        System.out.println(ans1);

    }
}
