package RecursionByKK.Questions.MergeAndQuickSort;

import OopsByKK.AccessModifier.Public.A;

import java.util.Arrays;

public class quickSort {

    static void swap(int[] arr,int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int partition(int[] arr,int start,int end){



        int position=start;

        for(int i=start;i<=end;i++){

            if(arr[i]<=arr[end]){
                swap(arr,i,position);
                position++;
            }

        }

        return position-1;
    }

    static void QuickSort(int[] arr,int start,int end){

        if(start>=end) return;

        int pivot=partition(arr,start,end);
        QuickSort(arr,start,pivot-1);
        QuickSort(arr,pivot+1,end);
    }

    public static void main(String[] args) {

        int[] arr={6,4,2,8,13,7,11,9,3,6};
        System.out.println(Arrays.toString(arr));

        QuickSort(arr,0,9);

        System.out.println(Arrays.toString(arr));

    }
}
