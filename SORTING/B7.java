package SORTING;

import java.util.Scanner;

public class B7 {

    static boolean Search(int arr[][],int n,int target,int rows,int columns){

        int start=0,end=n-1;

        int i=0,j=columns-1;

        while(i<n && j>=0){

            if(target==arr[i][j]){
                return true;
            }

            if(target<arr[i][j]){
                j--;

            }

            else{
                i++;
            }


        }



     return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println(" enter rows ");
        int row=sc.nextInt();


        System.out.println(" enter columns ");
        int column=sc.nextInt();



        int n=row*column;
        int arr[][]=new int[row][column];

        System.out.println(" enter " + n + " elements ");

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }



        System.out.println("enter target");
        int target=sc.nextInt();


        System.out.println(" output is " +Search(arr,n,target,row,column));


    }
}
