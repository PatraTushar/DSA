//import java.util.*;
//
//public class myPractice {
//
//    static int func(int[] nums) {
//
//        int n = nums.length;
//        int majority = 0;
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            if (count==0){
//
//                majority=nums[i];
//                count=1;
//            }
//
//
//            else if (nums[i]==majority) count++;
//
//            else count--;
//
//        }
//
//        return majority;
//
//
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
//        List<Integer> ans = func(arr);
//        System.out.println(ans);
//
//    }
//}
//
//
//
//
