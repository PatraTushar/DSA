package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q50 {

    static int repeating(int arr[],int n){

        int ans=-1;

        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){

                    return arr[i];
                }

            }
        }

        return ans;
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println(" enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println(" enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(" first repeating element is " +repeating(arr,n));


    }
}
