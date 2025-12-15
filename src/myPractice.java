//import java.util.ArrayList;
//import java.util.List;
//
//public class myPractice {
//
//    static boolean isValidPaths(int n, int rows, int cols, List<String> board) {
//
//        int dupRow = rows;
//        int dupCols = cols;
//
//
//        // left diagonal check
//
//        while (rows >= 0 && cols >= 0) {
//
//            if (board.get(rows).charAt(cols) == 'Q') return false;
//            rows--;
//            cols--;
//        }
//
//
//        rows = dupRow;
//        cols = dupCols;
//
//        // upper check
//
//        while (rows >= 0) {
//
//            if (board.get(rows).charAt(cols) == 'Q') return false;
//            rows--;
//        }
//
//
//        // right diagonal check
//
//        rows = dupRow;
//        cols = dupCols;
//
//        while (rows >= 0 && cols < n) {
//
//            if (board.get(rows).charAt(cols) == 'Q') return false;
//            rows--;
//            cols++;
//        }
//
//        return true;
//
//    }
//
//
//    static void generateAllPossiblePaths(int n, int rows, List<String> board, List<List<String>> result) {
//
//        if (rows >= n) {
//
//            result.add(new ArrayList<>(board));
//            return;
//        }
//
//        for (int cols = 0; cols < n; cols++) {
//
//            if (isValidPaths(n, rows, cols, board)) {
//
//                char[] rowChars = board.get(rows).toCharArray();
//                rowChars[cols] = 'Q';
//                board.set(rows, new String(rowChars));
//
//                generateAllPossiblePaths(n, rows + 1, board, result);
//
//
//                rowChars[cols] = '.';
//                board.set(rows, new String(rowChars));
//
//
//            }
//        }
//
//    }
//
//
//    static List<List<String>> nQueen(int n) {
//
//        // Time Complexity (TC):  O(N × N!)
//        // Space Complexity (SC): O(N²)
//
//        List<List<String>> result = new ArrayList<>();
//        List<String> board = new ArrayList<>();
//
//        String rowString = ".".repeat(n);
//
//        for (int i = 0; i < n; i++) {
//
//            board.add(rowString);
//        }
//
//        generateAllPossiblePaths(n, 0, board, result);
//
//
//        return result;
//    }
//
//
//    // OPTIMAL
//    static List<List<String>> nQueenI(int n) {
//
//
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int n = 4;
//        List<List<String>> ans = nQueen(n);
//        System.out.println(ans);
//
//
//    }
//
//
//}
//
