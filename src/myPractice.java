import java.util.Arrays;

public class myPractice {


    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 1; j < n-i; j++) {

                if (arr[j] < arr[j - 1]) {

                    swap(arr, j, j - 1);
                    swapped = true;
                }


            }

            if(!swapped) break;
        }

        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {


        int arr[] = {5, 3, 8, 6, 2};
        bubbleSort(arr);

    }

}











