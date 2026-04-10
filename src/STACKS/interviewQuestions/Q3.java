package STACKS.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q3 {

    static int[] nextGreaterElement(int[] arr) {

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] NGE = new int[n];

        NGE[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (!st.isEmpty() && st.peek() > arr[i]) NGE[i] = st.peek();

            else {

                while (!st.isEmpty() && st.peek() <= arr[i]) {

                    st.pop();
                }

                NGE[i] = st.isEmpty() ? -1 : st.peek();

            }
            st.push(arr[i]);
        }

        return NGE;

    }


    static int[] nextSmallerElement(int[] arr) {

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] NSE = new int[n];

        NSE[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (!st.isEmpty() && st.peek() < arr[i]) NSE[i] = st.peek();

            else {

                while (!st.isEmpty() && st.peek() >= arr[i]) {

                    st.pop();
                }

                NSE[i] = st.isEmpty() ? -1 :st.peek();

            }
            st.push(arr[i]);
        }

        return NSE;


    }

    public static void main(String[] args) {

        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[] arr1 = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[] Ans = nextGreaterElement(arr);
        System.out.println(Arrays.toString(Ans));
        int[] Ans1 = nextSmallerElement(arr1);
        System.out.println(Arrays.toString(Ans1));


    }
}
