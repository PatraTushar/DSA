package STACKS.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q26 {

    static List<Integer> getMinimumAtPop(int[] arr) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        Stack<Integer> st = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for (int ele : arr) {

            if (st.isEmpty()) st.push(ele);

            else {

                if (ele < st.peek()) st.push(ele);

                else st.push(st.peek());
            }
        }

        while (!st.isEmpty()) {

            result.add(st.pop());
        }

        return result;


    }



    static Stack<Integer> push(int[] arr, int n) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) st.push(arr[i]);

            else {

                if (arr[i] < st.peek()) st.push(arr[i]);

                else st.push(st.peek());
            }

        }

        return st;

    }

    static void getMin(Stack<Integer> st) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        while (!st.isEmpty()) {

            System.out.print(st.pop() + " " );
        }


    }



    public static void main(String[] args) {

        int[] arr={2,1,3,5,0,6};
        int n = 6;
        System.out.println(getMinimumAtPop(arr));
        Stack<Integer> st = push(arr, n);
        getMin(st);


    }
}
