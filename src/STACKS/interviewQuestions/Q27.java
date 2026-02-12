package STACKS.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q27 {

    // BruteForce approach
    static int[] maxOfMin(int[] arr) {

        // Time Complexity: O(n³)
        // Space Complexity: O(n)

        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result,Integer.MIN_VALUE);


        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n - i; j++) {

                int min = Integer.MAX_VALUE;

                for (int k = j; k < j + i + 1; k++) {

                    min = Math.min(min, arr[k]);
                }

                result[i] = Math.max(result[i], min);

            }

        }

        return result;
    }

    // optimal approach
    static ArrayList<Integer> MaxOfMin(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = arr.length;
        int[] pse = new int[n];  // previous smaller element index
        int[] nse = new int[n];  // next smaller element index
        int[] res = new int[n];  // result array

        Stack<Integer> st = new Stack<>();

        // Step 1: Find Previous Smaller Element (PSE)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }


        // clear stack for next step
        st.clear();

        // Step 2: Find Next Smaller Element (NSE)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }


        // Step 3: Fill res[length - 1] = max(res[length - 1], arr[i])
        Arrays.fill(res, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int len = nse[i] - pse[i] - 1;        // len: window size for which arr[i] is the minimum element
            res[len - 1] = Math.max(res[len - 1], arr[i]);
        }


        // Step 4: Fill remaining empty spots
        for (int i = n - 2; i >= 0; i--) {
            res[i] = Math.max(res[i], res[i + 1]);
        }


        ArrayList<Integer> resultList=new ArrayList<>();
        for (int val : res) resultList.add(val);

        return resultList;




    }

    static int[] maxOfMinI(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = arr.length;
        int[] pse = new int[n];  // previous smaller element index
        int[] nse = new int[n];  // next smaller element index
        int[] res = new int[n];  // result array

        Stack<Integer> st = new Stack<>();

        // Step 1: Find Previous Smaller Element (PSE)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }


        // clear stack for next step
        st.clear();

        // Step 2: Find Next Smaller Element (NSE)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }


        // Step 3: Fill res[length - 1] = max(res[length - 1], arr[i])
        Arrays.fill(res, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int len = nse[i] - pse[i] - 1;        // len: window size for which arr[i] is the minimum element
            res[len - 1] = Math.max(res[len - 1], arr[i]);
        }


        // Step 4: Fill remaining empty spots
        for (int i = n - 2; i >= 0; i--) {
            res[i] = Math.max(res[i], res[i + 1]);
        }

        return res;
    }


    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 50, 10, 70, 30};
        int[] ans = maxOfMin(arr);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = maxOfMinI(arr);
        System.out.println(Arrays.toString(ans1));
        ArrayList<Integer> ans2=MaxOfMin(arr);
        System.out.println(ans2);


    }
}
