package ArraysbyKK.binarySearchPattern;

public class Q18 {

    static int firstOccurrence(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int result=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target){

                result=mid;
                end=mid-1;

            }

            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return result;



    }

    public static void main(String[] args) {

        // Q:find the first element of a given element x,given that the array is sorted .if no occurrence of x is found then return -1

        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int target=5;
        System.out.println(firstOccurrence(arr,target));
    }
}
