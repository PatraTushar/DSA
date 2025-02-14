package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q9 {

    static int uniqueElement(int arr[],int n){     //1 2 3 4 2 1 3


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){

                    arr[i]=-1;
                    arr[j]=-1;

                }




            }


        }

        int ans=-1;

        for(int i=0;i<n;i++){

            if(arr[i]>0){

                ans=arr[i];

            }
        }



        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter elements in the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=uniqueElement(arr,n );
        System.out.println(" unique element is " +ans);


    }
}
