package ArraysbyStriver.binarySearchPattern;

public class Q1 {

    static int binarySearch(int[] arr,int target){

        // Time Complexity: O(log n)
        // Space Complexity: O(1)

        int start=0;
        int end=arr.length-1;



     while (start<=end){

         int mid=start+(end-start)/2;

         if(arr[mid]==target) return mid;

         else if(target>arr[mid]){
             start=mid+1;
         }

         else {
             end=mid-1;
         }
     }

     return start;


    }

    public static void main(String[] args) {

        // Binary Search (leeTCode->35)

        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
}
