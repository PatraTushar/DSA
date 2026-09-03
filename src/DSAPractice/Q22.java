package DSAPractice;

public class Q22 {

    static int isAsc(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }

        return -1;


    }

    static int isDesc(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            else if (target > arr[mid]) high = mid - 1;
            else low = mid + 1;
        }

        return -1;


    }

    static int orderAgnosticBS(int[] arr, int target) {

        int n = arr.length;
        int res;


        if (arr[0] <=arr[n-1])  res=isAsc(arr,target);
        else res=isDesc(arr,target);

        return res;



    }

    public static void main(String[] args) {


        int[] arr1 = {1, 3, 5, 6, 9, 12, 14, 20, 33};
        int[] arr2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println(orderAgnosticBS(arr1, 20));
        System.out.println(orderAgnosticBS(arr2, 80));
    }
}
