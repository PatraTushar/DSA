package StackByStriver.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q4 {


    // brute force approach
    static int[] nextGreaterElement2(int[] arr) {


        int n = arr.length;
        int[] nge = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= i + n - 1; j++) {


                int index = j % n;

                if (arr[index] > arr[i]) {

                    nge[i] = arr[index];
                    break;

                } else nge[i] = -1;

            }
        }


        return nge;


    }


    // optimal approach
    static int[] nextGreaterElementII(int[] arr) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[(2 * n - 1) % n]);
        int[] nge = new int[n];

        for (int i = 2 * n - 2; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i % n]) {

                st.pop();


            }


            if (i < n) {

                if (!st.isEmpty()) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(arr[i % n]);


        }

        return nge;
    }

    public static void main(String[] args) {

        int[] arr = {2, 10, 12, 1, 11};
        int[] arr1 = {5, 3, 4, 6};
        int[] ans = nextGreaterElementII(arr);
        int[] ans1 = nextGreaterElement2(arr1);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));


    }
}
