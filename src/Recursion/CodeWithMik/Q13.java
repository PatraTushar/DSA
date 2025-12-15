package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q13 {

    static boolean isValidPaths(List<String> board, int rows, int cols, int n) {

        int dupRow = rows;
        int dupCols = cols;


        // diagonally Left check

        while (rows >= 0 && cols >= 0) {

            if (board.get(rows).charAt(cols) == 'Q') return false;
            rows--;
            cols--;
        }


        // upper check

        rows = dupRow;
        cols = dupCols;


        while (rows >= 0) {


            if (board.get(rows).charAt(cols) == 'Q') return false;
            rows--;


        }

        // right diagonal check

        rows = dupRow;
        cols = dupCols;

        while (rows >= 0 && cols < n) {

            if (board.get(rows).charAt(cols) == 'Q') return false;
            rows--;
            cols++;


        }

        return true;


    }


    static void generatePossiblePaths(int rows, List<String> board, List<List<String>> result, int n) {

        if (rows >= n) {
            result.add(new ArrayList<>(board));
            return;
        }

        for (int cols = 0; cols < n; cols++) {

            if (isValidPaths(board, rows, cols, n)) {

                char[] rowChars = board.get(rows).toCharArray();
                rowChars[cols] = 'Q';
                board.set(rows, new String(rowChars));

                generatePossiblePaths(rows + 1, board, result, n);

                rowChars[cols] = '.';
                board.set(rows, new String(rowChars));


            }

        }


    }


    static List<List<String>> solveNQueen(int n) {

        // Time Complexity (TC): O(N! * N )
        // Space Complexity (SC): O(N²)


        List<String> board = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();

        String rowString = ".".repeat(n);

        for (int i = 0; i < n; i++) {

            board.add(rowString);
        }


        generatePossiblePaths(0, board, result, n);


        return result;


    }


    static void generateAllPossiblePathsI(int n, int rows, List<String> board, List<List<String>> result, HashSet<Integer> leftDiagonal, HashSet<Integer> verticallyUpward, HashSet<Integer> rightDiagonal) {


        if (rows >= n) {

            result.add(new ArrayList<>(board));
            return;
        }


        for (int cols = 0; cols < n; cols++) {

            int leftDiagonalConstant = rows - cols;
            int rightDiagonalConstant = rows + cols;


            if (leftDiagonal.contains(leftDiagonalConstant) || verticallyUpward.contains(cols) || rightDiagonal.contains(rightDiagonalConstant))
                continue;

            char[] rowChars = board.get(rows).toCharArray();
            rowChars[cols] = 'Q';
            board.set(rows, new String(rowChars));


            leftDiagonal.add(leftDiagonalConstant);
            verticallyUpward.add(cols);
            rightDiagonal.add(rightDiagonalConstant);

            generateAllPossiblePathsI(n,rows+1,board,result,leftDiagonal,verticallyUpward,rightDiagonal);

            rowChars = board.get(rows).toCharArray();
            rowChars[cols] = '.';
            board.set(rows, new String(rowChars));

            leftDiagonal.remove(leftDiagonalConstant);
            verticallyUpward.remove(cols);
            rightDiagonal.remove(rightDiagonalConstant);






        }


    }


    static List<List<String>> solveNQueenI(int n) {

        // Time Complexity (TC): O(N!)
        // Space Complexity (SC): O(N²)


        List<String> board = new ArrayList<>();
        HashSet<Integer> leftDiagonal = new HashSet<>();
        HashSet<Integer> verticallyUpward = new HashSet<>();
        HashSet<Integer> rightDiagonal = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        String rowString = ".".repeat(n);

        for (int i = 0; i < n; i++) {

            board.add(rowString);
        }

        generateAllPossiblePathsI(n, 0, board, result, leftDiagonal, verticallyUpward, rightDiagonal);

        return result;


    }


    public static void main(String[] args) {

        int n = 4;
        List<List<String>> ans = solveNQueen(n);
        System.out.println(ans);
        List<List<String>> ansI = solveNQueenI(n);
        System.out.println(ansI);


    }
}
