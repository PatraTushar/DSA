package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q57 {

    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void swap(int arr[],int x,int y){

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }


    static int[] square(int arr[],int n){

        int ans[]=new int[n];

        int left=0;
        int right=n-1;
        int k=0;

        while(left<=right){

            if(Math.abs(arr[left]) > Math.abs(arr[right])){

                ans[k++]=arr[left]*arr[left];
                left++;

            }

            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }

        return ans;



    }

    static void reverse(int answer[],int n){

        int left=0,right=n-1;

       while(left<=right){
           swap(answer,left,right);
           left++;
           right--;
       }

    }





    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" original array ");
        printarr(arr,n);


        System.out.println();

        int answer[]=square(arr,n);

        reverse(answer,n);

        System.out.println(" square is ");
        printarr(answer,n);





    }
}
