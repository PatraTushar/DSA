//package DSAPractice;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Q15 {
//
//    static int pascalTriangleI(int row, int col) {
//
//
//        int result = 1;
//
//
//        if (row == 1) return 1;
//
//
//        else {
//
//            int newRow = row - 1;
//            int newCol = col - 1;
//
//
//            for (int i = 1; i <= newCol; i++) {
//
//                result *= newRow;
//                result /= i;
//
//                newRow--;
//
//            }
//        }
//
//        return result;
//    }
//
//    static List<Integer> pascalTriangleII(int n) {
//
//        List<Integer> list = new ArrayList<>();
//        long result = 1;
//
//        for (int cols = 1; cols <= n; cols++) {
//
//            if (cols == 1 || cols == n) list.add(1);
//
//            else {
//
//                result*=(n-1)
//
//            }
//
//
//        }
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//        System.out.println(pascalTriangleI(5, 3));
//        List<Integer> ans = pascalTriangleII(5);
//        System.out.println(ans);
//
//    }
//}
