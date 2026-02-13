import java.util.Arrays;

public class myPractice {

    static int merge(int[] arr, int low, int mid, int high) {


        int[] mergeArray = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        int count = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {

                mergeArray[k++] = arr[i++];
            } else {

                count += mid - i + 1;
                mergeArray[k++] = arr[j++];


            }
        }

        while (i <= mid) {

            mergeArray[k++] = arr[i++];


        }


        while (j <= high) {

            mergeArray[k++] = arr[j++];


        }

        for (int p = 0; p < mergeArray.length; p++) {

            arr[low + p] = mergeArray[p];
        }

        return count;

    }


    static int mergeSort(int[] arr, int low, int high) {

        int count = 0;

        if (low >= high) return count;

        int mid = low + (high - low) / 2;

       count+= mergeSort(arr, low, mid);
        count+=mergeSort(arr, mid + 1, high);
        count+= merge(arr, low, mid, high);

        return count;


    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};
        int res = mergeSort(arr, 0, arr.length - 1);
        System.out.println(res);


    }

}

