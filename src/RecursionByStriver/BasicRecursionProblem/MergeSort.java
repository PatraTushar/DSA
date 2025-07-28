package RecursionByStriver.BasicRecursionProblem;

import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int start, int end) {

        //  Time Complexity: O(n²) (in worst case, due to shifting in in-place merge)
        // Space Complexity: O(1) (in-place, no extra array used)

        if (start == end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);


    }


    static void merge(int[] arr, int start, int mid, int end) {

        // in-place

        //  Time Complexity: O(n²) (in worst case, due to shifting in in-place merge)
        // Space Complexity: O(1) (in-place, no extra array used)


        int i = start;
        int j = mid + 1;


        while (i <= mid && j <= end) {

            if(arr[i]<=arr[j]){

                i++;
            }

            else {

                int value=arr[j];
                int index=j;

                while (index>i){

                    arr[index]=arr[index-1];
                    index--;
                }

                arr[i]=value;
                i++;
                mid++;
                j++;
            }

        }
    }

    static void mergesortI(int[] arr,int start,int end){

        if(start==end) return ;
        int mid=start+(end-start)/2;

        mergesortI(arr,start,mid);
        mergesortI(arr,mid+1,end);
        mergeI(arr,start,mid,end);


    }


    static void mergeI(int[] arr,int start,int mid,int end){

        // using extra array

        //  Time Complexity (TC): O(n log n)
        // Space Complexity (SC): O(n)

        int i=start;
        int j=mid+1;
        int k=0;
        int[] mergeArray=new int[end-start+1];

        while (i<=mid && j<=end){

            if(arr[i]<=arr[j]){

                mergeArray[k]=arr[i];
                i++;

            }

            else {

                mergeArray[k]=arr[j];
                j++;

            }

            k++;


        }

        while (i<=mid){

            mergeArray[k]=arr[i];
            i++;
            k++;
        }

        while (j<=end){

            mergeArray[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mergeArray.length;l++){

            arr[start + l]=mergeArray[l];
        }


    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 4, 12, 5, 6};
        int[] arr1={14,3,7,1,5,4};

        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

        mergesortI(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));


    }
}
