package ArraysbyKK.binarySearchPattern;

public class Q8 {

    static int peakElement(int[] arr){
        //TC = O(log n)
        //SC = O(1)

        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;


            if(mid<end && arr[mid]>arr[mid+1]){
                end=mid;
            }

            else {
                start=mid+1;
            }




        }

        return start;

    }
    public static void main(String[] args) {

        // Q: Peak index in a mountain array (leeTCode->852)

        int[] arr={3,5,3,2,0};
        System.out.println(peakElement(arr));



    }
}
