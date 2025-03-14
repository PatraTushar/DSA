package RecursionByKK.Questions.pattern_BubbleAndSelectionSort;

import java.util.Arrays;

public class selectionSort {

    static void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    static int Max(int[] arr,int start,int end){

        int max=start;

        for(int i=start;i<=end;i++){



            if(arr[i]>arr[max]){

                max=i;

            }

        }
        return max;
    }

    static void sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int last=arr.length-i-1;
            int findMax=Max(arr,0,last);
            swap(arr,findMax,last);

        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

        int[] arr={5,4,2,3,1};
        sort(arr);


    }
}
