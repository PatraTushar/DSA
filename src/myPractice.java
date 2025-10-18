import java.util.Arrays;
import java.util.Stack;

public class myPractice {


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
        int sum;


        for (int i = 0; i < n; i++) {

            sum = heights[i] * (nse[i] - pse[i] - 1);
            largestArea = Math.max(sum, largestArea);


        }

        return largestArea;


    }


    static int[][] prefixSum(char[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int[][] pSum = new int[rows][cols];

        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {

                sum += arr[i][j] - '0';

                if (arr[i][j] == '0') sum = 0;

                pSum[i][j] = sum;


            }

        }

        return pSum;


    }


    static int maximalRectangle(char[][] arr) {


        int rows = arr.length;


        int[][] prefixSum = prefixSum(arr);

        int maxArea = 0;


        for (int i = 0; i < rows; i++) {


            maxArea = Math.max(maxArea, largestRectangleHistogram(prefixSum[i]));

        }

        return maxArea;


    }


    public static void main(String[] args) {

        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(maximalRectangle(matrix));


    }
}













