package ArraysbyStriver.binarySearchPattern;

public class Q7 {

    static int searchElementInInfiniteArray(int[] arr,int target){

        int start=0;
        int end=1;

        while (end<arr.length && target> arr[end]){

        int  newStart=end+1;
         end=end+2*(end-start+1);
         start=newStart;
        }

        if (end >= arr.length) end = arr.length - 1;




        while (start<=end){

            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }

            else {
                end=mid-1;
            }
        }

        return -1;



    }

    public static void main(String[] args) {

        // Q: find the position of an element in a sorted array of infinite numbers

        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=15;
        System.out.println(searchElementInInfiniteArray(arr,target));
    }
}
