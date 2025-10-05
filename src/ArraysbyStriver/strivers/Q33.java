package ArraysbyStriver.strivers;

public class Q33 {


    // Brute Force Approach
    static int countInversion(int[] arr) {

        // Time Complexity (TC): O(n²)
        //Space Complexity (SC): O(1)

        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) count++;

            }


        }

        return count;


    }

    static int merge(int[] arr, int start, int mid, int end) {

        int count = 0;
        int left = start;
        int right = mid + 1;
        int[] mergedArray = new int[end - start + 1];
        int k = 0;

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) mergedArray[k++] = arr[left++];

            else {

                count += mid - left + 1;
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

        return count;


    }

    static int mergeSort(int[] arr, int start, int end) {


        int count = 0;
        if (start >= end) return count;

        int mid = start + (end - start) / 2;

        count += mergeSort(arr, start, mid);
        count += mergeSort(arr, mid + 1, end);
        count += merge(arr, start, mid, end);

        return count;


    }



    // Optimal Solution
    static int countInversionI(int[] arr) {

        // Time Complexity (TC): O(n log n)
        //Space Complexity (SC): O(n)

        return mergeSort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversion(arr));
        System.out.println(countInversionI(arr));


    }
}
