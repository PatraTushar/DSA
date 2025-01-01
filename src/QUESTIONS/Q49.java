package QUESTIONS;
import java.util.Scanner;
public class Q49 {

    static void swap(int ans[],int i,int j){

        i=0;j=ans.length-1;


        int temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }




    static int[] sortSquares(int arr[]){

        int x=arr.length;

        int left=0;
        int right=x-1;
        int ans[]=new int[x];
        int k=0;

        while(left <= right){

            if(Math.abs(arr[left]) > Math.abs(arr[right])){

                ans[k++]=arr[left] * arr[left];
                left ++;

            }

            else{
                ans[k++]=arr[right] * arr[ right];
                right--;
            }




        }


        return ans;


    }

    static void reverse(int ans[]){
        int i=0;
        int j= ans.length -1;

        while(i<j){
            swap(ans,i,j);
            i++;
            j--;
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

        System.out.println(" original array");
        printArray(arr);

        int[] ans=sortSquares(arr);

        System.out.println(" sorted array ");
        reverse(ans);
        printArray(ans);






    }
}
