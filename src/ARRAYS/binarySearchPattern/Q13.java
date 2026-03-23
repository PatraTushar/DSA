package ARRAYS.binarySearchPattern;

public class Q13 {

    static int rotationCount(int[] num){

        // Time Complexity: O(log n)
        // Space Complexity: O(1)



        int n = num.length;

        int low = 0;
        int high = n - 1;

        while (low != high) {

            int mid = low + (high - low) / 2;

            if (num[mid]>num[high]) low = mid + 1;

            else high = mid;


        }

        return low;

    }

    public static void main(String[] args) {

        // find the rotation count in rotated sorted array

        int[] num={3,4,5,1,2};
        System.out.println(rotationCount(num));

    }
}
