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


        // “How many subarrays have arr[i] as the minimum?”


        long sum = 0;


        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;
            sum = (sum + arr[i] * left * right) % MOD;


        }

        return (int) sum;

    }


    public static void main(String[] args) {


        // leeTCode->907

        int[] arr = {71, 55, 82, 55};
        int[] num = {3, 1, 2, 4};
        //  System.out.println(sumSubArrayMin(arr));
        System.out.println(sumSubArrayMinII(num));


    }


}


// PSE (Previous Smaller Element):
// stores index of nearest smaller element on left of i
// PSE can be -1 when no smaller element exists on left
// we use (i - PSE[i]) to count valid starting positions
// this also safely handles PSE[i] = -1 without breaking logic


// NSE (Next Smaller Element):
// stores index of nearest smaller element on right of i
// NSE can be n when no smaller element exists on right
// we use (NSE[i] - i) to count valid ending positions
// this gives number of ways arr[i] can act as minimum in subarrays