package SORTING;

import java.util.Scanner;

public class BINARYSEARCH {

    static boolean binarySearch(int arr[], int target, int n) {

        int start = 0, end = n - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;


    }


    static boolean recursiveBinarySearch(int arr[], int start, int end, int target) {


        if (start > end) {
            return false;
        }

            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return true;
            }
            else if (target < arr[mid]) {
               return recursiveBinarySearch(arr, start, mid - 1, target);
            }
            else {
                return recursiveBinarySearch(arr, mid + 1, end, target);
            }



    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter target ");
        int target=sc.nextInt();

        //System.out.println(binarySearch(arr,target,n));
        System.out.println(recursiveBinarySearch(arr,0,n-1,target));




    }
}
