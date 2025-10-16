package StackByStriver.interviewQuestions;


import java.util.Arrays;
import java.util.Stack;

public class Q19 {

    static int[] nextGreaterElementIV(int[] arr) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> currStack = new Stack<>();
        Stack<Integer> prevStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < n; i++) {

            int currentVal = arr[i];

            while (!prevStack.isEmpty() && arr[prevStack.peek()] < currentVal) {

                int indexToUpdate = prevStack.pop();
                result[indexToUpdate] = currentVal;

            }

            while (!currStack.isEmpty() && arr[currStack.peek()] < currentVal) {
                tempStack.push(currStack.pop());
            }

            while (!tempStack.isEmpty()) {
                prevStack.push(tempStack.pop());
            }

            currStack.push(i);

        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 4, 1, 6, 2, 9, 5, 7, 0};
        int[] ans = nextGreaterElementIV(arr);
        System.out.println(Arrays.toString(ans));
    }
}
