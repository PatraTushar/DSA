public class myPractice {


    static int binarySearch(int[] arr, int start, int end, int target) {


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) start = mid + 1;

            else end = mid - 1;
        }

        return -1;

    }


    static int findPivotIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start != end) {

            int mid = start + (end - start) / 2;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                start += 1;
                end -= 1;
            } else if (arr[start] < arr[mid]) start = mid;

            else end = mid;
        }

        return start;
    }


    static boolean findTarget(int[] nums, int target) {

        int n = nums.length;
        int pivotIndex = findPivotIndex(nums);

        int firstPart = binarySearch(nums, 0, pivotIndex, target);
        int secondPart = binarySearch(nums, pivotIndex + 1, n - 1, target);

        if (firstPart == -1 && secondPart == -1) return false;


        return true;

    }


    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(findTarget(arr, target));


    }
}











