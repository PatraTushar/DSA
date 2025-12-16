package Recursion.CodeWithMik;

public class Q14 {


    // BRUTE FORCE APPROACH
    static int kthGrammar(int n, int k) {

        // Time Complexity (TC): O(2^n)
        // Space Complexity (SC): O(2^n)

        int[][] result = new int[n][];

        result[0] = new int[1];
        result[0][0] = 0;


        for (int row = 1; row < n; row++) {

            int prevLength = result[row - 1].length;
            result[row] = new int[2 * prevLength];

            for (int col = 0; col < prevLength; col++) {

                result[row][col] = result[row - 1][col];
                result[row][col + prevLength] = result[row - 1][col] ^ 1;
            }

        }

        return result[n - 1][k - 1];

    }


    // OPTIMAL APPROACH
    static int kthGrammarI(int n, int k) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        if (n == 1 && k == 1) return 0;

        int parent = kthGrammarI(n - 1, (k + 1) / 2);

        if (k % 2 == 1) return parent;

        return parent ^ 1;


    }


    public static void main(String[] args) {

       // leeTCode->779

        int n = 4;
        int k = 8;
        System.out.println(kthGrammarI(n, k));

    }
}
