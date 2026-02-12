package ARRAYS.binarySearchPattern;

public class Q27 {

    static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc) {

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                ans = mid;
                end = mid - 1;
            } else if (isAsc) {

                if (target > arr[mid]) start = mid + 1;

                else end = mid - 1;


            } else {

                if (target > arr[mid]) end = mid - 1;

                else start = mid + 1;


            }


        }

        return ans;
    }

    static int findPeakIndex(int[] arr) {

        int n = arr.length;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < n && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) return mid;

            else if (mid > 0 && arr[mid] < arr[mid - 1]) {

                end = mid - 1;
            } else start = mid + 1;
        }

        return -1;


    }


    static int minTargetPeak(int[] mountainArr, int target) {

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int n = mountainArr.length;
        int peakIndex = findPeakIndex(mountainArr);

        int firstPart = binarySearch(mountainArr, target, 0, peakIndex, true);

        int secondPart = binarySearch(mountainArr, target, peakIndex + 1, n - 1, false);


        if (firstPart != -1)
            return firstPart;

        else return secondPart;


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(minTargetPeak(arr, target));


    }
}
