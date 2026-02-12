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

        // Time Complexity: O(2n)=O(n)
        // Space Complexity: O(1)

        int n = mat.length;


        int top = 0;
        int bottom = n - 1;

        while (top < bottom) {

            if (mat[top][bottom] == 1) top++;

            else if (mat[bottom][top] == 1) bottom--;

            else {

                top++;
                bottom--;
            }


        }


        if (top > bottom) return -1;

        for (int i = 0; i < n; i++) {

            if (i == top) continue;

            if (mat[top][i] == 0 && mat[i][bottom] == 1) {


            } else return -1;

        }

        return top;

    }

    public static void main(String[] args) {

        int[][] mat = {{0, 1, 1, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(celebrityProblem(mat));
        System.out.println(celebrityProblemI(mat));
    }
}
