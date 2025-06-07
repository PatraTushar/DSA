package ArraysbyKK.binarySearchPattern;


import java.util.Arrays;

public class Q25 {

    static int totalCows(int[] arr,int mid){

        int cowsPlace=1;
        int position=arr[0];

        for (int i=1;i<arr.length;i++){

            if(arr[i]-position>=mid){
                cowsPlace++;
                position=arr[i];
            }

        }
        return cowsPlace;


    }





    static int AggressiveCows(int[] arr,int cows){

        if(cows>arr.length) return -1;


        int n=arr.length;

        int start=1;
        int end=arr[n-1]-arr[0];

        while (start<=end){

            int mid=start+(end-start)/2;

          int placedCow=totalCows(arr,mid);

            if(placedCow<cows){
                end=mid-1;
            }

            else {
                start=mid+1;
            }


        }

        return end;

    }




    public static void main(String[] args) {

        // Aggressive cows

        int[] arr={0,3,4,7,10,9};
        int cows=4;
        Arrays.sort(arr);
        System.out.println(AggressiveCows(arr,cows));


    }
}
