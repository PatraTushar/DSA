package ARRAYS.interviewQuestions;

import java.util.Arrays;

public class Q13 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void sort0sAnd1s(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int i = 0;
        int j = arr.length-1;

        while (i < j) {

            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;

            }
            else if(arr[i]==0 && arr[j]==0){
                i++;
            }

            else {
                j--;
            }

        }
    }

    public static void main(String[] args) {

        // Q: sort an array consisting of 0s and 1s

        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        sort0sAnd1s(arr);
        System.out.println(Arrays.toString(arr));
    }
}
