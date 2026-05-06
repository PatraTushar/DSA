//package STRINGS.InterviewQuestions;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//
//public class Q54 {
//
//    static int[] minOperations(String boxes) {
//
//        // Time Complexity: O(n^2)
//        // Space Complexity: O(n)
//
//        int n = boxes.length();
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//
//            if (boxes.charAt(i) == '1') set.add(i);
//
//        }
//
//        int[] result = new int[n];
//
//
//        for (int i = 0; i < n; i++) {
//
//            for (int idx : set) {
//
//                result[i] += Math.abs(i - idx);
//
//            }
//        }
//
//        return result;
//
//    }
//
//    static int[] minOperationI(String boxes) {
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//        // leeTCode->1769
//
//        String boxes = "110";
//        int[] result = minOperations(boxes);
//        System.out.println(Arrays.toString(result));
//
//
//    }
//}
