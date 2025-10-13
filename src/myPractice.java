import java.util.*;

public class myPractice {


    static void merge(int[] arr1, int m, int[] arr2, int n) {

        int length = m + n;
        int i = m - 1;
        int j = n - 1;
        int k = length - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] >= arr2[j]) {

                arr1[k--] = arr1[i--];
            } else {

                arr1[k--] = arr2[j--];
            }


        }

        while (j >= 0) {

            arr1[k--] = arr2[j--];
        }

        System.out.println(Arrays.toString(arr1));


    }

    public static void main(String[] args) {

        // merge sorted array (leeTCode->88)
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        merge(arr1, m, arr2, n);


    }
}







