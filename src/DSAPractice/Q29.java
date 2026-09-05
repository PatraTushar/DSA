package DSAPractice;

public class Q29 {

    static int binarySearch(int[] num, int target,int low,int high) {




        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == num[mid]) return mid;

            else if (target > num[mid]) low = mid + 1;

            else high = mid - 1;
        }

        return -1;
    }

    static int findPivot(int[] num) {

        int n = num.length;
        int low = 0;
        int high = n - 1;

        while (low != high) {

            int mid = low + (high - low) / 2;

            if (num[low] < num[mid]) low = mid;
            else high = mid;


        }

        return low;
    }

    static int findTarget(int[] nums, int target) {

        int n=nums.length;
        int pivot = findPivot(nums);

        int firstHalf=binarySearch(nums,target,0,pivot);
        int secondHalf=binarySearch(nums,target,pivot+1,n-1);
        if (firstHalf!=-1) return firstHalf;
        else return secondHalf;

    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        System.out.println(" target is in index " + findTarget(arr, target));
    }
}
