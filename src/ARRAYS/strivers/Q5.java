package ARRAYS.strivers;

public class Q5 {

    static int missingNumber(int[] num){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = num.length;

        int nthSum = n * (n + 1) / 2;

        int sum = 0;

        for (int ele : num) {

            sum += ele;


        }

        return nthSum-sum;




    }

    public static void main(String[] args) {

        // missing number (leeTCode->268)

        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
