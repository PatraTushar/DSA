package ARRAYS.binarySearchPattern;

public class Q16 {

    static int getMaxElement(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            max = Math.max(max, ele);
        }

        return max;
    }

    static int getArraySum(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    static int countSubArrays(int[] arr, int mid) {

        int parts = 1;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            if (total + arr[i] <= mid) {
                total += arr[i];
            } else {
                parts++;
                total = arr[i];
            }
        }

        return parts;

    }


    static int splitArray(int[] num, int k) {

        // Time Complexity: O(n)+O(n)+O(n⋅log(sum−max))=O(n⋅log(sum−max))
        // Space Complexity: O(1)


        int start = getMaxElement(num);
        int end = getArraySum(num);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int totalParts = countSubArrays(num, mid);

            if (totalParts > k) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }


        }

        return start;


    }

    public static void main(String[] args) {

        // split array largest sum(leeTCode-->410)

        int[] arr = {10, 20, 10, 10};
        int k = 2;
        System.out.println(splitArray(arr, k));


    }
}
