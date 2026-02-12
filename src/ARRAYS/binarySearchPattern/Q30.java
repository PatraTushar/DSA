package ARRAYS.binarySearchPattern;

public class Q30 {

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) max = ele;


        }

        return max;
    }


    // BRUTE FORCE APPROACH
    static int smallestDivisor(int[] arr, int threshold) {

        // Time Complexity: O(max(arr) × n))
        // Space Complexity: O(1)

        int max = findMax(arr);
        int n = arr.length;

        for (int divisor = 1; divisor <= max; divisor++) {

            int sum = 0;

            for (int i = 0; i < n; i++) {

                sum += Math.ceil((double) arr[i] / divisor);


            }

            if (sum <= threshold) return divisor;


        }

        return -1;
    }


    // OPTIMAL SOLUTION
    static int smallestDivisorI(int[] arr, int threshold) {

        // Time Complexity: O(n.log(max(arr)-1))
        // Space Complexity: O(1)


        int start = 1;
        int end = findMax(arr);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int currThreshold = isPossible(arr, mid);

            if (currThreshold <= threshold) {

                end = mid - 1;
            } else start = mid + 1;
        }

        return start;


    }


    static int isPossible(int[] arr, int mid) {

        int threshold = 0;

        for (int ele : arr) {

            threshold += Math.ceil((double) ele / mid);


        }

        return threshold;


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 9};
        int threshold = 6;

        System.out.println(smallestDivisor(arr, threshold));
        System.out.println(smallestDivisorI(arr, threshold));

    }
}
