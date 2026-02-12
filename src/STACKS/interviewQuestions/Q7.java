package STACKS.interviewQuestions;

import java.util.Stack;

public class Q7 {

    static int sumSubArrayMin(int[] arr) {

        // brute force bt for longer values it gives TLE(Time Limit Exceeded)

        // Time Complexity: O(n²)
        // Space Complexity: O(1)

        int sum = 0;
        int MOD = (int) 1e9 + 7;

        for (int i = 0; i < arr.length; i++) {

            int mini = arr[i];

            for (int j = i; j < arr.length; j++) {

                mini = Math.min(mini, arr[j]);
                sum = (sum + mini) % MOD;
            }


        }

        return sum;


    }




    static int sumSubArrayMinII(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = arr.length;
        int MOD = (int) 1e9 + 7;
        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();


        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {

                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);


        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {

                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);

        }





        long sum = 0;


        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;
            sum = (sum + arr[i] * left * right) % MOD;


        }

        return (int) sum;

    }


    public static void main(String[] args) {

        int[] arr = {71, 55, 82, 55};
        //  System.out.println(sumSubArrayMin(arr));
        System.out.println(sumSubArrayMinII(arr));


    }


}
