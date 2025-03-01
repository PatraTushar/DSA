package RecursionByKK.Introduction;

import OopsByKK.AccessModifier.Public.B;

public class BinarySearchUsingRecursion {

    static int BinarySearch(int arr[],int target,int start,int end){

        if(start>end)  return -1;

        int mid=start+(end-start)/2;

        if(arr[mid]==target) return mid;

        else if (target<arr[mid]){

            return BinarySearch(arr,target,start,mid-1);
        }

        else return BinarySearch(arr,target,mid+1,end);




    }

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60,70,80,90};
        int target=80;
        int ans=BinarySearch(arr,target,0,arr.length-1);
        System.out.println(" ans is " +ans);
    }
}
