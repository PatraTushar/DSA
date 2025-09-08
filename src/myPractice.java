import java.util.Arrays;

public class myPractice {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n ; i++) {

            int j=i;

            while (j>0 && arr[j]<arr[j-1]){

                swap(arr,j,j-1);
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};
        insertionSort(arr);


    }

}











