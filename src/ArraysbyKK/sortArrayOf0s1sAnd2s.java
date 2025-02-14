package ArraysbyKK;


import java.util.Arrays;

public class sortArrayOf0s1sAnd2s {

    static void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int[] sort(int arr[]){

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){

            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;

            }

            else if(arr[mid]==1){
                mid++;

            }

            else{
                swap(arr,mid,high);
                high--;


            }
        }
        return arr;
    }



    public static void main(String[] args) {

        int arr[]={0,1,1,0,1,2,1,2,0,0,0};
        int[] ans=sort(arr);
        System.out.println(Arrays.toString(ans));



    }
}
