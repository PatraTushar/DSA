package STACKS.interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q2 {

    static int[] findNGE(int[] arr) {

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

    static int[] nextGreaterElementI(int[] arr1, int[] arr2) {

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)


        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nge = findNGE(arr2);

        for (int i = 0; i < n; i++) {


            map.put(arr2[i], nge[i]);

        }


        for (int i = 0; i < m; i++) {

            result[i] = map.get(arr1[i]);


        }


        return result;


    }

    public static void main(String[] args) {

        // leeTCode->496

        int[] arr1 = {4, 1, 2};
        int[] arr2 = {1, 3, 4, 2};
        int[] ans = nextGreaterElementI(arr1, arr2);
        System.out.println(Arrays.toString(ans));


    }
}
