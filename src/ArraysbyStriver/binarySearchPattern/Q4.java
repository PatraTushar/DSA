package ArraysbyStriver.binarySearchPattern;

public class Q4 {


    static int floor(int[] arr,int target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)



        int start = 0;
        int end = arr.length - 1;



        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return arr[mid];

            else if (target > arr[mid]) {
                start = mid + 1;


            } else {
                end = mid - 1;
            }
        }

        return (end >=0) ? arr[end] : -1;
    }

    public static void main(String[] args) {

        // floor of a number

        int[] arr={2,3,5,9,14,16,18};
        System.out.println(floor(arr,15));


    }
}
