package Recursion.CodeWithMik;

public class Q27 {

    static int[] dRows = {-1, 0, 1, 0};
    static int[] dCols = {0, -1, 0, 1};

    static boolean find(char[][] board, String word, int row, int col, int idx) {

        if (idx == word.length()) return true;

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == '$' || board[row][col] != word.charAt(idx))
            return false;


        char temp = board[row][col];
        board[row][col] = '$';

        for (int i = 0; i < 4; i++) {

            int newRow = row + dRows[i];
            int newCol = col + dCols[i];

            if (find(board, word, newRow, newCol, idx + 1)) return true;
        }


        board[row][col] = temp;


        return false;


    }


    static boolean exist(char[][] board, String word) {

        //  Time Complexity (TC): O(m×n×4^k)     m = number of rows in board      n = number of columns in board    k = length of the word
        //  Space Complexity (SC): O(k)

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (board[i][j] == word.charAt(0) && find(board, word, i, j, 0)) {

                    return true;

                }
            }
        }

        return false;


    }

    public static void main(String[] args) {

        // leeTCode->79

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        System.out.println(exist(board, word));
    }
}
