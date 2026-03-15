import java.util.Arrays;

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

    static int[] func(int[] arr) {

        int[] result = new int[arr.length];

        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) evenCount++;

        }

        int left = 0;
        int right = evenCount;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) result[left++] = arr[i];

            else result[right++]=arr[i];


        }

        return result;


    }


    public static void main(String[] args) {

        int[] arr = {2, 9, 5, 1, 4, 6, 3, 8};
       int[] ans= func(arr);
        System.out.println(Arrays.toString(ans));


    }
}




