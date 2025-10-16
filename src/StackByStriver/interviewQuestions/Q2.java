package StackByStriver.interviewQuestions;

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

    static int[] nextGreaterElementI(int[] nums1, int[] nums2) {

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)


        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nge = findNGE(nums2);

        for (int i = 0; i < n; i++) {


            map.put(nums2[i], nge[i]);

        }


        for (int i = 0; i < m; i++) {

            result[i] = map.get(nums1[i]);


        }


        return result;


    }

    public static void main(String[] args) {

        // leeTCode->496

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ans = nextGreaterElementI(nums1, nums2);
        System.out.println(Arrays.toString(ans));


    }
}
