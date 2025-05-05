package ArraysbyKK.binarySearchPattern;

public class Q3 {

    static int ceiling(int[] arr,int target){

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int start=0;
        int end=arr.length-1;


        while (start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]) return arr[mid];

            if(target>arr[mid]){
                start=mid+1;
            }

            else {
                end=mid-1;
            }
        }

        return (start<arr.length) ? arr[start] : -1;


    }

    public static void main(String[] args) {

        // ceiling of a number

        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(ceiling(arr,target));
    }
}
