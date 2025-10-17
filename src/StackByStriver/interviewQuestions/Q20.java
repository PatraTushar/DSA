package StackByStriver.interviewQuestions;

import java.util.Stack;

public class Q20 {

    static int[] findPGE(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[n];

        st.push(0);
        pge[0] = -1;

        for (int i = 1; i < n; i++) {

            if (arr[st.peek()] >= arr[i]) {

                pge[i] = st.peek();

            } else {

                while (!st.isEmpty() && arr[st.peek()] < arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) pge[i] = st.peek();
                else pge[i] = -1;
            }

            st.push(i);
        }

        return pge;
    }


    static int[] findNGE(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];

        st.push(n - 1);
        nge[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {

            if (arr[st.peek()] > arr[i]) {

                nge[i] = st.peek();

            } else {

                while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) nge[i] = st.peek();
                else nge[i] = n;
            }

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
