package StackByStriver.interviewQuestions;

import java.util.Stack;

public class Q20 {

    static int[] findPGE(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[n];


        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();
            }

            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);


        }


        return pge;
    }


    static int[] findNGE(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];


        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {

                st.pop();
            }

            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return nge;


    }


    static int sumOfSubArrayMaximum(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = arr.length;
        int MOD = (int) 1e9 + 7;
        int[] pge = findPGE(arr);
        int[] nge = findNGE(arr);

        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - pge[i];
            long right = nge[i] - i;
            sum = (sum + left * right * arr[i]) % MOD;

        }

        return (int) sum;
    }

    public static void main(String[] args) {

        int[] arr = {71, 55, 82, 55};
        System.out.println(sumOfSubArrayMaximum(arr));

    }
}
