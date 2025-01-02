package SORTING;

import java.util.Scanner;

public class B6 {

    static boolean searchIn2DArr(int arr[][], int target, int n, int row, int column) {

        int start = 0, end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int rowNo = (mid / column);
            int columnNo = (mid % column);
            int midElt = arr[rowNo][columnNo];


            if (target == midElt) {
                return true;
            }

           if(target<midElt){
               end=mid-1;
           }

           else{
               start=mid+1;
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

        System.out.println("output is " +searchIn2DArr(arr,target,n, row,column));




    }
}
