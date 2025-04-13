package ArraysbyKK.binarySearchPattern;

public class Q12 {

    static int findMin(int[] num) {

        int start=0;
        int end=num.length-1;
        int min=  Integer.MAX_VALUE;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(num[start]<=num[mid]){

                if(num[start]<min){
                    min=num[start];
                }
                start=mid+1;
            }

            else{
                if(num[start]<min){
                    min=num[start];
                }
                end=mid;
            }
        }




        return min;

    }

    public static void main(String[] args) {

        // find the minimum in rotated sorted array (leeTCode-->153)

        int[] num={3,4,5,1,2};
        System.out.println(findMin(num));



    }
}
