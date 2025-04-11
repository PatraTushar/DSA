package ArraysbyKK.binarySearchPattern;

public class Q3 {

    static int ceiling(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]) return arr[mid];

           else if(target>arr[mid]){
                start=mid+1;
            }
           else {
               end=mid-1;
            }
        }

        return start==arr.length ? -1 : arr[start];
    }

    public static void main(String[] args) {

        // ceiling of a number

        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(ceiling(arr,target));
    }
}
