package STACKS.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q3 {

    static int[] nextGreaterElement(int[] arr) {

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        nge[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (st.peek() > arr[i]) {

                nge[i] = st.peek();
                st.push(arr[i]);

            } else {


                while (!st.isEmpty() && st.peek() <= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) nge[i] = st.peek();
                else nge[i] = -1;
                st.push(arr[i]);

            }


        }

        return nge;

    }


    static int[] nextSmallerElement(int[] arr){

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        nse[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (st.peek() < arr[i]) {

                nse[i] = st.peek();
                st.push(arr[i]);

            } else {


                while (!st.isEmpty() && st.peek() >= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) nse[i] = st.peek();
                else nse[i] = -1;
                st.push(arr[i]);

            }


        }

        return nse;



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
