public class myPractice {


    static int func(int[] arr, int x) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] < x) low = mid + 1;

            else {

                index=mid;
                high=mid-1;


            }


        }

        return index;


    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(func(arr, target));


    }
}




