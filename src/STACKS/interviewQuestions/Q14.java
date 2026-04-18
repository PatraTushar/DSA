package STACKS.interviewQuestions;

import java.util.Stack;

public class Q14 {

    static int largestRectangleHistogram(int[] heights) {

        int n = heights.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        if (n == 0) return 0;

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {

                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);


        }

        st.clear();


        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {

                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);

        }


        int largestArea = Integer.MIN_VALUE;
        int val;


        for (int i = 0; i < n; i++) {

            val = heights[i] * (nse[i] - pse[i] - 1);
            largestArea = Math.max(val, largestArea);


        }

        return largestArea;


    }


    static int maximalRectangle(char[][] matrix) {

        //Time Complexity (TC): O(R × C) + O(C)
        //Space Complexity (SC): O(C)

        //R = number of rows
        //C = number of columns

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];


        int maxArea = 0;


        for (int i = 0; i < rows; i++) {


            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') heights[j] += 1;

                else heights[j] = 0;


            }

            maxArea = Math.max(maxArea, largestRectangleHistogram(heights));

        }

        return maxArea;


    }


    public static void main(String[] args) {

        //leeTCode->85

        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(maximalRectangle(matrix));


    }
}
