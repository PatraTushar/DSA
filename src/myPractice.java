import java.util.Arrays;

public class myPractice {


    static int merge(int[] num, int low, int mid, int high) {


        int[] mergeArray = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        int count = 0;

        while (left <= mid && right <= high) {

            if (num[left] <= num[right]) mergeArray[k++] = num[left++];
            else {

                mergeArray[k++] = num[right++];
                count += mid - left + 1;
            }
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


        return count;

    }


    static int mergeSort(int[] num, int low, int high) {


        int count = 0;
        if (low >= high) return count;

        int mid = low + (high - low) / 2;

        count += mergeSort(num, low, mid);
        count += mergeSort(num, mid + 1, high);
        count += merge(num, low, mid, high);

        return count;


    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(mergeSort(arr, 0, arr.length - 1));

    }
}




