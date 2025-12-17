package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.List;

public class Q19 {

    static void solve(int currNum, int n, List<Integer> result) {


        if (currNum > n) return;

        result.add(currNum);

        for (int append = 0; append <= 9; append++) {

            int newNum = (currNum * 10) + append;

            if (newNum > n) return;

            solve(newNum, n, result);
        }


    }

    static List<Integer> lexicoOrder(int n) {

        //  Time Complexity (TC): O(n)
        //  Space Complexity (SC): O(n)

        List<Integer> result = new ArrayList<>();

        for (int start = 1; start <= 9; start++) {

            solve(start, n, result);


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->386

        int n=13;
        List<Integer> ans=lexicoOrder(n);
        System.out.println(ans);


    }

}
