//package Greedy;
//
//public class Q29 {
//
//    static boolean allIndexMarked(int seconds, int[] nums, int changeIndices) {
//
//
//
//    }
//
//
//    static int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
//
//        int n = nums.length;
//        int m = changeIndices.length;
//
//        for (int time = 0; time < m; time++) {
//
//            if (allIndexMarked(time, nums, changeIndices)) return time + 1;
//        }
//
//        return -1;
//
//
//    }
//
//    public static void main(String[] args) {
//
//        int[] nums = {2, 2, 0};
//        int[] changeIndices = {2, 2, 2, 2, 3, 2, 2, 1};
//        System.out.println(earliestSecondToMarkIndices(nums, changeIndices));
//
//
//    }
//}
