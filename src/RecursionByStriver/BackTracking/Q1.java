package RecursionByStriver.BackTracking;

import java.util.*;

public class Q1 {

    static boolean isSafe(int row, int col, List<String> board, int n) {
        int dupRow = row, dupCol = col;

        // Check upper-left diagonal
        while (row >= 0 && col >= 0) {
            if (board.get(row).charAt(col) == 'Q') return false;
            row--;
            col--;
        }

        // Check left
        row = dupRow;
        col = dupCol;
        while (col >= 0) {
            if (board.get(row).charAt(col) == 'Q') return false;
            col--;
        }

        // Check lower-left diagonal
        row = dupRow;
        col = dupCol;
        while (row < n && col >= 0) {
            if (board.get(row).charAt(col) == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }

    static void solve(int col, List<String> board, List<List<String>> ans, int n) {
        if (col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                // Place queen
                char[] rowChars = board.get(row).toCharArray();
                rowChars[col] = 'Q';
                board.set(row, new String(rowChars));

                solve(col + 1, board, ans, n);

                // Backtrack
                rowChars[col] = '.';
                board.set(row, new String(rowChars));
            }
        }
    }

    static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String rowString = ".".repeat(n);         // This line creates a string of n dots ('.').

        for (int i = 0; i < n; i++) {
            board.add(rowString);
        }

        solve(0, board, result, n);
        return result;
    }


    public static void main(String[] args) {

        int n = 4;
        List<List<String>> res = solveNQueens(n);

        for (List<String> solution : res) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }


    }
}
