package GreedyAlgorithm;

public class Q4 {

    static boolean canJump(int[] arr) {

        //  Time Complexity:  O(n)
        //  Space Complexity: O(1)

        int n = arr.length;

        int maxIndex = 0;

        for (int i = 0; i < n; i++) {

            if (i > maxIndex) return false;

            maxIndex = Math.max(maxIndex, i + arr[i]);


        }

        return true;


    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 0, 4};
        System.out.println(canJump(arr));

    }
}
