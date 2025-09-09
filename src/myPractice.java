import java.util.Arrays;

public class myPractice {


    static void countSort(int[] arr) {

        // Time Complexity : O(n) + O(n) + O(m +  n)
        // Space Complexity : O(m+1) = O(m)

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }


        }


        int[] freq = new int[max + 1];

        int m = freq.length;

        for (int i = 0; i < n; i++) {

            freq[arr[i]]++;


        }


        int k = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < freq[i]; j++) {

                arr[k++] = i;

            }


        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};
        countSort(arr);


    }

}











