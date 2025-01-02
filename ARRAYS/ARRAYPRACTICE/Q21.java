package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q21 {

    static void printArray(int arr[],int n ){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void swap(int ans[],int i,int j){
        int temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }

    static void reverse(int ans[],int n){
        int i=0;
        int j=n-1;

        while(i<=j){
            if(ans[i]>ans[j]){
                swap(ans,i,j);
                i++;
                j--;
            }
        }
    }

   static int[] sortInNonDecreasingOrder(int arr[],int n){

        int ans[]=new int[n];
        int left=0;
        int right=n-1;
        int k=0;

        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                left++;
                k++;
            }

            else{
                ans[k]=arr[right]*arr[right];
                right--;
                k++;
            }
        }

        return ans;
   }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elelments ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" input array ");
        printArray(arr,n);

        int ans[]=sortInNonDecreasingOrder(arr,n);

        System.out.println(" sorted array ");
        reverse(ans,n);
        printArray(ans,n);



    }
}
