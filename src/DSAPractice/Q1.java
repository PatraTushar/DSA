package DSAPractice;

import java.util.HashSet;

public class Q1 {

    static int totalPairs(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int ele : arr) {

            int required = target - ele;

            if (set.contains(required)) count++;

            set.add(ele);


        }

        return count;


    }


    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;
        System.out.println(" Total pairs : " + totalPairs(arr, target));


    }
}
