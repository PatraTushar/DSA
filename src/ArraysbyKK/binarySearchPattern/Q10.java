package ArraysbyKK.binarySearchPattern;

public class Q10 {



    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // left side is sorted

            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;

                }

                else {
                    start=mid+1;
                }
            }

            // right side is sorted
            else {

                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }

                else {
                    end=mid-1;
                }
            }

        }
        return -1;





    }

    public static void main(String[] args) {

        // search in rotated sorted array (leeTCode-->33)

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(" target is in index " + search(arr, target));
    }
}
