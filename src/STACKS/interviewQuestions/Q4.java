package STACKS.interviewQuestions;

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
    static int[] nextGreaterElementII(int[] num) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int length = num.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[length];
        st.push(num[(2 * length - 1) % length]);

        for (int i = 2 * length - 2; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= num[i%length]) {

                st.pop();
            }


            if (i < length) {

                if (st.isEmpty()) nge[i]=-1;
                else nge[i]=st.peek();

            }

            st.push(num[i % length]);
        }

        return nge;
    }

    public static void main(String[] args) {

        // leeTCode 503
        int[] arr = {2, 10, 12, 1, 11};
        int[] arr1 = {5, 3, 4, 6};
        int[] ans = nextGreaterElementII(arr);
        int[] ans1 = nextGreaterElement2(arr1);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));


    }
}
