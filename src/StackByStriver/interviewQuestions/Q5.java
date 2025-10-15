package StackByStriver.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q5 {

    static int[] previousGreaterElement(int[] arr) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();

        pge[0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < n; i++) {

            if (st.peek() > arr[i]) {

                pge[i] = st.peek();
                st.push(arr[i]);

            } else {


                while (!st.isEmpty() && st.peek() <= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) pge[i] = st.peek();
                else pge[i] = -1;
                st.push(arr[i]);

            }


        }

        return pge;


    }


    static int[] previousSmallerElement(int[] arr){

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        pse[0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < n; i++) {

            if (st.peek() < arr[i]) {

                pse[i] = st.peek();
                st.push(arr[i]);

            } else {


                while (!st.isEmpty() && st.peek() >= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) pse[i] = st.peek();
                else pse[i] = -1;
                st.push(arr[i]);

            }


        }

        return pse;


    }

    public static void main(String[] args) {

        int[] arr = {5, 7, 9, 6, 7, 4, 5, 1, 3, 7};
        int[] arr1 = {5, 7, 9, 6, 7, 4, 5, 1, 3, 7};
        int[] ans = previousGreaterElement(arr);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = previousSmallerElement(arr1);
        System.out.println(Arrays.toString(ans1));


    }
}
