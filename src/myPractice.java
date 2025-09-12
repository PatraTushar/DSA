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


    static void func(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i]  == 1 && arr[j]  == 0) {

                swap(arr, i, j);
            } else if (arr[i]  == 0) i++;

            else j--;
        }

        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {

        int[] arr = {1, 0,0,1,0,1,1,0,0};
        func(arr);


    }

}











