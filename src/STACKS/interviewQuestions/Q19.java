package STACKS.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q19 {

    static int[] nextGreaterElementIV(int[] nums) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1); // Default: if no 2nd greater element found → -1

        // Stack 1: holds indices of elements waiting for their FIRST greater element
        Stack<Integer> currStack = new Stack<>();

        // Stack 2: holds indices of elements that already got FIRST greater,
        // now waiting for SECOND greater element
        Stack<Integer> prevStack = new Stack<>();

        // Temporary stack to maintain order while moving elements
        // (because stack reverses order)
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < n; i++) {

            int currentVal = nums[i]; // current element

            // STEP 1:
            // Check for elements in prevStack (waiting for SECOND greater)
            // If current value is greater → we found their SECOND greater
            while (!prevStack.isEmpty() && currentVal > nums[prevStack.peek()]) {

                int indexToUpdate = prevStack.pop(); // remove index
                result[indexToUpdate] = currentVal;  // update answer

                // Meaning:
                // This index already had FIRST greater earlier,
                // now currentVal becomes its SECOND greater
            }

            // STEP 2:
            // Check for elements in currStack (waiting for FIRST greater)
            // If current value is greater → we found their FIRST greater
            while (!currStack.isEmpty() && currentVal > nums[currStack.peek()]) {

                // Move them to tempStack first
                tempStack.push(currStack.pop());

                // Meaning:
                // These elements just found their FIRST greater (currentVal),
                // so they should now move to prevStack (waiting for SECOND greater)
            }

            // STEP 3:
            // Move elements from tempStack → prevStack
            // to maintain correct order
            while (!tempStack.isEmpty()) {

                prevStack.push(tempStack.pop());

                // Now these elements are:
                // "I already got my FIRST greater,
                // now waiting for SECOND greater"
            }

            // STEP 4:
            // Push current index into currStack
            currStack.push(i);

            // Meaning:
            // Current element has not found even its FIRST greater yet
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 4, 1, 6, 2, 9, 5, 7, 0};

        int[] ans = nextGreaterElementIV(arr);

        System.out.println(Arrays.toString(ans));
    }
}