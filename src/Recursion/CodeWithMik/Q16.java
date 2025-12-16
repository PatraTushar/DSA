package Recursion.CodeWithMik;


public class Q16 {

    static int findWinner(int n, int k) {

        return josephusProblem(n, k) + 1;


    }

    static int josephusProblem(int n, int k) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        if (n == 1) return 0;

        int winner = josephusProblem(n - 1, k);
        winner = (winner + k) % n;
        return winner;


    }


    static int findTheWinner(int n, int k) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(1)

        int winner = 0;

        for (int size = 2; size <= n; size++) {

            winner = (winner + k) % size;
        }

        return winner + 1;


    }


    public static void main(String[] args) {

        // leeTCode->1823

        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
        System.out.println(findWinner(n,k));

    }
}
