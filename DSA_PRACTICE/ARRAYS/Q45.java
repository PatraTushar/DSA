package DSA_PRACTICE.ARRAYS;


import java.util.Scanner;

public class Q45 {

    static boolean sorted(int arr[],int n){

        boolean check=true;

        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
               check=true;
            }

            else{
                check=false;
            }
        }
        return check;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }


        System.out.println(" is sorted " +sorted(arr,n));


    }
}
