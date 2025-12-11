package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q2 {

    static int towerOfHonoi(int n, int source, int Auxiliary, int destination) {

        //  Time Complexity: O(2^n)
        //  Space Complexity: O(n)


        if (n <= 0) return 0;

        if (n == 1) {

            System.out.println(" disk moved from " + source + " to " + destination);
            return 1;
        }


        int minMoves = 0;

        minMoves = towerOfHonoi(n - 1, source, destination, Auxiliary);

        minMoves += towerOfHonoi(1, source, Auxiliary, destination);

        minMoves += towerOfHonoi(n - 1, Auxiliary, source, destination);

        return minMoves;


    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println(towerOfHonoi(n, 1, 2, 3));
    }
}
