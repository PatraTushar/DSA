package ARRAYS.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q23 {

    //Time Complexity: O(n^2)
    //Space Complexity: O(n^2)



    static int pascalTriangleI(int rows, int cols) {   //  row=5 col=3




        // Time Complexity: O(cols)
        //  Space Complexity: O(1)

        // TYPE 1->Given row and col and tell the element at that place

        rows = rows - 1;
        cols = cols - 1;

        int result = 1;

        for (int i = 1; i <= cols; i++) {


            result *= (rows - i + 1);
            result = result / i;


        }

        return result;


    }


    static List<Integer> pascalTriangleII(int rowIndex) {

        // Type 2->Print the nth row of pascal triangle

        // Time Complexity: O(row)
        //  Space Complexity: O(row)

        List<Integer> nthRow = new ArrayList<>();



        long result = 1;

        for (int col = 0; col <= rowIndex; col++) {

            if (col == 0 || col == rowIndex) {
                nthRow.add(1);

            } else {

                result *= (rowIndex - col + 1);
                result/=col;
                nthRow.add((int) result);
            }


        }

        return nthRow;
    }

    static List<List<Integer>> pascalTriangleIII(int numRows) {

        //Type 3-> you are given n  and  u have  to print the entire pascal triangle

        // Time Complexity: O(n²)
        //Space Complexity: O(n²)

        List<List<Integer>> result = new ArrayList<>();


        for (int i = 1; i <= numRows; i++) {

            result.add(pascalTriangleII(i));

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
