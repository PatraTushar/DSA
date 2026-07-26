//package SlidingWindow.InterviewQuestions;
//
//public class Q23 {
//
//    static int shortestSubArrayI(int[] num, int k) {
//
//        int n = num.length;
//
//        int minLength = Integer.MAX_VALUE;
//
//
//        for (int i = 0; i < n; i++) {
//
//            long sum = 0;
//            for (int j = i; j < n; j++) {
//
//                sum += num[j];
//
//                if (sum >= k) minLength = Math.min(minLength, j - i + 1);
//            }
//
//        }
//
//        return minLength == Integer.MAX_VALUE ? -1 : minLength;
//    }
//
//    static int shortestSubArray(int[] nums, int k) {
//
//        int n = nums.length;
//
//
//    }
//
//    public static void main(String[] args) {
//
//        // leeTCode->862
//
//        int[] num = {2, -1, 2};
//        int k = 3;
//        System.out.println(shortestSubArray(num, k));
//
//
//    }
//}
