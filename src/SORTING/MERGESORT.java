package SORTING;

import java.util.Scanner;

public class MERGESORT {

    static void displayArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void merge(int arr[],int l,int mid,int r){

        int n1=mid-l+1;
        int n2=r-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];



        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }

            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }

        while(i<n1) {
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }
    }

    static void mergesort(int arr[],int l,int r){

        if(l==r) return;

        int mid=(l+r)/2;

        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);

        merge(arr,l,mid,r);


    }

    public static void main(String[] args) {

       int[] arr={5,2,9,1,6};
       int n=arr.length;

        System.out.println(" array before sorting ");
        displayArr(arr,n);
        System.out.println();

        mergesort(arr,0,n-1);

        System.out.println(" array after sorting ");
        displayArr(arr,n);




    }
}
