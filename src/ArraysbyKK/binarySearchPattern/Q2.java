package ArraysbyKK.binarySearchPattern;

public class Q2 {

    static int orderAgnosticBS(int [] arr,int target){

       // Time Complexity (TC): O(log n)
      //  Space Complexity (SC): O(1)

        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];
        while (start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;

            if(isAsc){

                if (target>arr[mid]) {

                    start=mid+1;

                }

                else {
                    end=mid-1;
                }
            }

            else {

                 if (target>arr[mid]) {

                    end=mid-1;

                }

                else {
                    start=mid+1;
                }


            }
        }

        return start;

    }

    public static void main(String[] args) {

        // order Agnostic binary search

        int [] arr1={1,3,5,6,9,12,14,20,33};
        int[] arr2={100,90,80,70,60,50,40,30,20,10};
        System.out.println(orderAgnosticBS(arr2,20));

    }
}
