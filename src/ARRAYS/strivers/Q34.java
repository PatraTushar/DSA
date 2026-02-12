package ARRAYS.strivers;

public class Q34 {


    static long possiblePairs(int[] arr, int start, int mid, int end) {


        int right = mid + 1;
        int count = 0;

        for (int i = start; i <= mid; i++) {

            while (right <= end && (long)arr[i] > (2L * arr[right])) {

                right++;


            }

            count += right - (mid + 1);


        }

        return count;
    }

    static long merge(int[] arr, int start, int mid, int end) {

        int pairs = 0;
        int left = start;
        int right = mid + 1;
        int[] mergedArray = new int[end - start + 1];
        int k = 0;

        pairs += possiblePairs(arr, start, mid, end);


        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) mergedArray[k++] = arr[left++];

            else {


                mergedArray[k++] = arr[right++];
            }
        }

        while (left <= mid) {

            mergedArray[k++] = arr[left++];
        }

        while (right <= end) {

            mergedArray[k++] = arr[right++];
        }


        for (int i = 0; i < mergedArray.length; i++) {

            arr[start + i] = mergedArray[i];


        }

        return pairs;


    }

    static long mergeSort(int[] arr, int start, int end) {


        int count = 0;
        if (start >= end) return count;

        int mid = start + (end - start) / 2;

        count += mergeSort(arr, start, mid);
        count += mergeSort(arr, mid + 1, end);
        count += merge(arr, start, mid, end);

        return count;


    }


    static int reversePairs(int[] arr) {

        // Time Complexity (TC): O(n log n)
        //Space Complexity (SC): O(1)


        return (int) mergeSort(arr, 0, arr.length - 1);

    }


    public static void main(String[] args) {

        // leeTCode->493

        int[] arr = {40, 25, 19, 12, 9, 6, 2};
        System.out.println(reversePairs(arr));

    }
}
