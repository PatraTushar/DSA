package STACKS.interviewQuestions;

public class Q25 {

    static int celebrityProblem(int[][] arr) {

        // Time Complexity: O(n²)
        // Space Complexity: O(n)

        int n = arr.length;
        int rows = arr.length;
        int cols = arr[0].length;

        int[] iKnow = new int[n];
        int[] knownBySomeone = new int[n];


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == 1) {

                    iKnow[i]++;
                    knownBySomeone[j]++;

                }

            }
        }


        for (int i = 0; i < n; i++) {

            if (iKnow[i] == 0 && knownBySomeone[i] == n - 1) return i;

        }


        return -1;


    }


    static int celebrityProblemI(int[][] mat) {

        int n = mat.length;

        int top = 0;
        int bottom = n - 1;

        // Step 1: Find celebrity
        while (top < bottom) {

            if (mat[top][bottom] == 1) {
                // top knows bottom → top can't be celebrity
                top++;
            } else {
                // top does NOT know bottom → bottom can't be celebrity
                bottom--;
            }
        }

        // Step 2: Verify celebrity
        int celebrity = top;

        for (int i = 0; i < n; i++) {

            if (i == celebrity) continue;

            // celebrity should not know anyone
            // everyone should know celebrity
            if (mat[celebrity][i] == 1 || mat[i][celebrity] == 0) {
                return -1;
            }
        }

        return celebrity;
    }


    public static void main(String[] args) {

        int[][] mat = {{0, 1, 1, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(celebrityProblem(mat));
        System.out.println(celebrityProblemI(mat));
    }
}
