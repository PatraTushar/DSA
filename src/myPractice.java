
public class myPractice {

    static int lessThanEqualTo(int[] arr, int num) {


        int rows = arr.length;


        int low = 0;
        int high = rows - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= num) low = mid + 1;

            else high = mid - 1;


        }


        return low;
    }

    static int findMedian(int[][] arr) {

        int n = arr.length;
        int rows = arr.length;
        int cols = arr[0].length;
        int totalLength = rows * cols;
        int median = totalLength / 2;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            low = Math.min(low, arr[i][0]);
            high = Math.max(high, arr[i][cols - 1]);
        }

        while (low < high) {


            int mid = low + (high - low) / 2;
            int count = 0;


            for (int i = 0; i < rows; i++) {

                count += lessThanEqualTo(arr[i], mid);

            }

            if (count <= median) low = mid + 1;

            else high = mid;


        }


        return low;

    }

    public static void main(String[] args) {

        int[][] arr = {{1, 5, 7, 9, 11}, {2, 3, 4, 5, 10}, {9, 10, 12, 14, 16}};
        int ans = findMedian(arr);
        System.out.println(ans);


    }

}

