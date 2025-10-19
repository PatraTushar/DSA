package StackByStriver.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q28 {

    static int[] minOfMax(int[] arr) {

        // Time Complexity: O(n³)
        // Space Complexity: O(n)

        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, Integer.MAX_VALUE);


        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n - i; j++) {

                int max = Integer.MIN_VALUE;

                for (int k = j; k < j + i + 1; k++) {

                    max = Math.max(max, arr[k]);
                }

                result[i] = Math.min(max, result[i]);

            }


        }

        return result;
    }

    static int[] minOfMaxI(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = arr.length;
        int[] pge = new int[n];
        int[] nge = new int[n];
        int[] result = new int[n];
        Arrays.fill(result, Integer.MAX_VALUE);

        Stack<Integer> st = new Stack<>();

        // find pge index

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();
            }

            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);


        }


        st.clear();


        // find nge index

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();
            }

            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);

        }


        for (int i = 0; i < n; i++) {

            int len = nge[i] - pge[i] - 1;  // len: window size for which arr[i] is the maximum element
            result[len - 1] = Math.min(result[len - 1], arr[i]);

        }

        for (int i = n - 2; i >= 0; i--) {

            result[i] = Math.min(result[i], result[i + 1]);
        }


        return result;
    }

    static ArrayList<Integer> MinOfMax(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)


        int n = arr.length;
        int[] pge = new int[n];
        int[] nge = new int[n];
        int[] result = new int[n];
        Arrays.fill(result, Integer.MAX_VALUE);

        Stack<Integer> st = new Stack<>();

        // find pge index

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();
            }

            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);


        }


        st.clear();


        // find nge index

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();
            }

            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);

        }


        for (int i = 0; i < n; i++) {

            int len = nge[i] - pge[i] - 1;  // len: window size for which arr[i] is the maximum element
            result[len - 1] = Math.min(result[len - 1], arr[i]);

        }

        for (int i = n - 2; i >= 0; i--) {

            result[i] = Math.min(result[i], result[i + 1]);
        }


        ArrayList<Integer> resultList = new ArrayList<>();

        for (int ele : result) resultList.add(ele);

        return resultList;


    }


    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 50, 10, 70, 30};
        int[] ans = minOfMax(arr);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = minOfMaxI(arr);
        System.out.println(Arrays.toString(ans1));
        ArrayList<Integer> ans2 = MinOfMax(arr);
        System.out.println(ans2);

    }
}
