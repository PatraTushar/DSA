import java.util.ArrayList;
import java.util.List;

public class myPractice {


    static List<Integer> generatePascal(int rowIndex) {

        List<Integer> nthRow = new ArrayList<>();


        long result = 1;

        for (int col = 0; col <= rowIndex; col++) {

            if (col == 0 || col == rowIndex) {
                nthRow.add(1);

            } else {

                result *= (rowIndex - col + 1);
                result /= col;
                nthRow.add((int) result);
            }


        }

        return nthRow;


    }

    static List<List<Integer>> pascal(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            result.add(new ArrayList<>(generatePascal(row)));
        }

        return result;
    }


    public static void main(String[] args) {

        // int[][] arr = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}, {1, 5, 10, 10, 5, 1}};

        int row = 5;

        List<List<Integer>> res=pascal(row);
        System.out.println(res);


    }


}

