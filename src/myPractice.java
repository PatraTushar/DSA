import java.util.Arrays;

public class myPractice {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int findPartitionIndex(int[] arr, int low, int high) {


        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {


            while (i <= high && arr[i] <= pivot) {

                i++;
            }

            while (j >= low && arr[j] > pivot) {

                j--;


            }

            if (i < j) swap(arr, i, j);


        }

        swap(arr, low, j);

        return j;


    }


    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int partitionIndex = findPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);


        }


    }


    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

}











