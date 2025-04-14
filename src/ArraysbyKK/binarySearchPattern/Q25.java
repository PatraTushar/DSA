//package ArraysbyKK.binarySearchPattern;
//
//import java.util.Arrays;
//
//public class Q25 {
//
//    static int findMax(int[] arr){
//
//        int max=Integer.MIN_VALUE;
//
//        for(int a:arr){
//            if(a>max){
//                max=a;
//            }
//        }
//
//        return max;
//    }
//
//    static int isPossible(int[] arr,int mid){
//
//        int totalCows=1;
//        int totalSum=0;
//        int min=Integer.MAX_VALUE;
//
//        for(int i=1;i<arr.length;i++){
//
//            if(arr[i]-arr[i-1]<min){
//                min=arr[i]-arr[i-1];
//            }
//
//
//        }
//    }
//
//    static void AggressiveCows(int[] arr,int cows){
//
//        int start=1;
//        int end=findMax(arr);
//
//        while (start<=end){
//
//            int mid=start+(end-start)/2;
//            int canWePlaceCows;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // Aggressive cows
//
//        int[] arr={0,3,4,7,10,9};
//        int cows=4;
//
//        Arrays.sort(arr);
//
//    }
//}
