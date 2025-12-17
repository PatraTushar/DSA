package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.List;

public class Q18 {

    static List<Integer> differentWaysToCompute(String expression) {

      //  Time Complexity (TC): O(n * 2^n)
      //  Space Complexity (SC): O(n * 2^n) (for storing results + recursion stack)

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {


                List<Integer> leftResult = differentWaysToCompute(expression.substring(0, i));
                List<Integer> rightResult = differentWaysToCompute(expression.substring(i + 1));


                for (int leftEle : leftResult) {

                    for (int rightEle : rightResult) {

                        if (ch=='+') result.add(leftEle + rightEle);

                        else if (ch=='-') result.add(leftEle - rightEle);

                        else result.add(leftEle * rightEle);
                    }
                }


            }
        }

        if (result.isEmpty()) result.add(Integer.parseInt(expression));

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->241

        String s="2*3-4*5";
        List<Integer> result=differentWaysToCompute(s);
        System.out.println(result);
    }
}
