import java.util.Arrays;

public class myPractice {


    static void merge(int[] num, int low, int mid, int high) {


        int[] mergeArray = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {

            if (num[left] <= num[right]) mergeArray[k++] = num[left++];
            else mergeArray[k++] = num[right++];
        }

        while (left <= mid) {

            mergeArray[k++] = num[left++];
        }

        while (right <= high) {

            mergeArray[k++] = num[right++];
        }

        for (int i = 0; i < mergeArray.length; i++) {

            num[low + i] = mergeArray[i];
        }


    }


    static void mergeSort(int[] num, int low, int high) {


        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(num, low, mid);
        mergeSort(num, mid + 1, high);
        merge(num, low, mid, high);


    }


    public static void main(String[] args) {

        int[] arr = {7, 9, 6, 10, 4, 8, 5, 2, 1, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}




