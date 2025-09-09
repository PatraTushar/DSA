import java.util.Arrays;

public class myPractice {


    static void merge(int[] arr, int start, int mid, int end) {


        int[] newArr = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {

                newArr[k++] = arr[i];
                i++;

            } else {

                newArr[k++] = arr[j];
                j++;
            }
        }


        while (i <= mid) {

            newArr[k++] = arr[i++];

        }

        while (j <= end) {

            newArr[k++] = arr[j++];
        }


        for (int a = 0; a < newArr.length; a++) {

            arr[ start+ a] = newArr[a];
        }


    }

    static void mergesort(int[] arr, int start, int end) {

        if (start == end) return;

        int mid = start + (end - start) / 2;

        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, mid, end);


    }

    public static void main(String[] args) {


        int[] arr = {1, 8, 4, 7, 6, 3, 9, 2, 5};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

}











