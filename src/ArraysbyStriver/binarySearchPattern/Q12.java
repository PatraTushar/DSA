package ArraysbyStriver.binarySearchPattern;

public class Q12 {

    static int findMin(int[] num) {

        int start=0;
        int end=num.length-1;

        while (start<end){

            int mid=start+(end-start)/2;

            if(num[mid]>num[end]){
                start=mid+1;
            }

            else {
                end=mid;
            }
        }

        return num[start];


    }

    public static void main(String[] args) {

        // find the minimum in rotated sorted array (leeTCode-->153)

        int[] num={3,4,5,1,2};
        System.out.println(findMin(num));



    }
}
