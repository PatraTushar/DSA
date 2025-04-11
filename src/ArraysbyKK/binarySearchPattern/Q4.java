package ArraysbyKK.binarySearchPattern;

public class Q4 {


    static int floor(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target) return arr[mid];

            else if (target>arr[mid]) {
                start=mid+1;


            }
            else{
                end=mid-1;
            }
        }

        return end==-1 ? -1 : arr[end];
    }

    public static void main(String[] args) {

        // floor of a number

        int[] arr={2,3,5,9,14,16,18};
        System.out.println(floor(arr,16));


    }
}
