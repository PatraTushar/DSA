package RecursionByKK.Questions.MergeAndQuickSort;

import java.util.Arrays;

public class MergeSort {

    static void mergesort(int[] arr,int start,int end){

        if(start==end) return;

        int mid=start+(end-start)/2;

        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);

        merge(arr,start,mid,end);



    }

    static void merge(int[] arr,int start,int mid,int end){

        int[] temp=new int[end-start+1];

        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){

            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }

            else {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }

        while (i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }

        while(j<=end){
            temp[k]=arr[j];
            k++;
            j++;
        }

        k=0;

//        while (start<=end){
//            arr[start]=temp[k];
//            k++;
//            start++;
//        }

        for(int idx=start;idx<=end;idx++){
            arr[idx]=temp[k++];

        }




    }


    public static void main(String[] args) {

        int[] arr={7,20,4,11,8,2};
        System.out.println(" before sorting ");
        System.out.println(Arrays.toString(arr));

        mergesort(arr,0,arr.length-1);

        System.out.println(" after sorting ");
        System.out.println(Arrays.toString(arr));

    }
}
