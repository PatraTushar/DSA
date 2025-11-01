package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q2 {

    static int towerOfHonoi(int n, int source, int Auxiliary, int destination) {

        //  Time Complexity: O(2^n)
        //  Space Complexity: O(n)


        if ( n == 1) return n;


        int count = towerOfHonoi(n - 1, source, destination, Auxiliary);

        count++;

        count += towerOfHonoi(n - 1, Auxiliary, source, destination);

        return count;


    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println(towerOfHonoi(n, 1,2,3));
    }
}
