package RecursionByStriver.Questions.Subset_Subsequence_String;


import java.util.Arrays;

public class practice {

    static void swap(int[] arr,int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void quickSort(int[] arr,int start,int end){

        if(start>=end) return;

        int pivot=partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);




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


    public static void main(String[] args) {

        int[] arr={6,4,2,8,13,7,11,9,3,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));





    }





}
