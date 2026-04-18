import java.util.Stack;

public class myPractice {


    static int[] NGE(int[] arr) {

        int length = arr.length;
        int[] nge = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {

                st.pop();
            }


            nge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return nge;


    }


    static int[] NSE(int[] arr) {

        int length = arr.length;
        int[] nse = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {

                st.pop();
            }


            nse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return nse;


    }


    static int[] PGE(int[] arr) {

        int length = arr.length;
        int[] pge = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {

                st.pop();
            }


            pge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return pge;


    }


    static int[] PSE(int[] arr) {

        int length = arr.length;
        int[] pse = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {

                st.pop();
            }


            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return pse;


    }


    static int histogram(int[] heights) {


        int length = heights.length;
        int[] pse = new int[length];
        int[] nse = new int[length];
        Stack<Integer> st = new Stack<>();


        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {

                st.pop();
            }


            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);


        }

        st.clear();


        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {

                st.pop();
            }


            nse[i] = st.isEmpty() ? length : st.peek();

            st.push(i);


        }


        int largestArea = Integer.MIN_VALUE;


        for (int i = 0; i < length; i++) {

            int val = heights[i] * (nse[i] - pse[i] - 1);
            largestArea = Math.max(largestArea, val);


        }

        return largestArea;

    }

    static int[][] prefixSum(char[][] matrix) {


        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] pSum = new int[rows][cols];

        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {

                sum += matrix[i][j] - '0';

                if (matrix[i][j] == '0') sum = 0;

                pSum[i][j] = sum;


            }
        }

        return pSum;

    }


    static int maximalRectangle(char[][] arr) {

        int rows = arr.length;
        int max = Integer.MIN_VALUE;

        int[][] pSum=prefixSum(arr);

        for (int i = 0; i < rows; i++) {

            max = Math.max(max, histogram(pSum[i]));

        }

        return max;
    }


    public static void main(String[] args) {

        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(maximalRectangle(matrix));



    }


}





