package DSAPractice;

import java.util.Arrays;
import java.util.HashSet;

public class Q2 {

    static int totalTripletPairs(int[] arr, int target) {

        int n = arr.length;


        Arrays.sort(arr);

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int ele : arr) {
            set.add(ele);
        }


        for (int p1 = 0; p1 < n - 2; p1++) {

            int p2 = p1 + 1;
            int p3 = n - 1;

            while (p2 < p3) {

                int sum = arr[p1] + arr[p2] + arr[p3];

                if (sum == target) {
                    count++;
                    p2++;
                    p3--;
                } else if (sum < target) p2++;
                else p3--;


            }


        }

        return count;


    }


    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 6, 3};
        int target = 12;
        System.out.println(" total pairs " + totalTripletPairs(arr, target));


    }
}
