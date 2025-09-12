package ArraysbyStriver.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q23 {

    //Time Complexity: O(n^2)
    //Space Complexity: O(n^2)

    static int[][] pascal(int n) {

        int[][] ans = new int[n][];


        for (int i = 0; i < n; i++) {

            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;


            for (int j = 1; j < i; j++) {

                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];


            }
        }


        return ans;


    }

    static int pascalTriangleI(int row, int col) {   //  row=5 col=3


        // Time Complexity: O(c)
        //  Space Complexity: O(1)

        // TYPE 1->Given row and col and tell the element at that place

        int n = row - 1;
        int c = col - 1;

        int result = 1;

        for (int i = 0; i < c; i++) {

            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;


    }


    static List<Integer> pascalTriangleII(int n) {

        // Type 2->Print the nth row of pascal triangle

        // Time Complexity: O(n)
        //  Space Complexity: O(n)

        List<Integer> result = new ArrayList<>();

        int ans = 1;
        result.add(ans);

        for (int i = 1; i < n; i++) {

            ans = ans * (n - i);
            ans = ans / i;
            result.add(ans);


        }

        return result;
    }

    static List<List<Integer>> pascalTriangleIII(int n) {

        //Type 3-> you are given n  and  u have  to print the entire pascal triangle

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> tempList = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {

                if (j == 0 || j == i) {
                    tempList.add(1);
                } else {
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    tempList.add(val);
                }

            }

            result.add(tempList);

        }
        return result;


    }


    public static void main(String[] args) {

        // pascal triangle  leeTCode->118


        System.out.println(pascalTriangleI(5, 3));
        List<Integer> ans = pascalTriangleII(3);
        System.out.println(ans);
        List<List<Integer>> answer = pascalTriangleIII(5);
        System.out.println(answer);


    }
}
