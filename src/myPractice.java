import java.util.Arrays;
import java.util.HashSet;

public class myPractice {

    static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void reverse(int[] arr, int i, int j) {




        while (i < j) {

            swap(arr, i, j);
            i++;
            j--;
        }



    }


    static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;


        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr,7);


    }

}











