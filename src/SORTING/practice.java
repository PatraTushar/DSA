package SORTING;

import java.util.Scanner;

public class practice {

    static void displayArr(int arr[],int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }

    static void merge(int arr[],int l,int mid ,int r){

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

            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }

            else{

                arr[k]=right[j];
                j++;
                k++;

            }



        }

        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(i<n2){
            arr[k]=right[j];
            j++;
            k++;
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

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergesort(arr,0,n-1);
        displayArr(arr,n);




    }
}
