package ArraysbyStriver.strivers;

public class Q5 {

    static int missingNumber(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = arr.length;

        int sumOfN = 0;

        for (int i = 1; i <= n; i++) {

            sumOfN += i;
        }


        int sumOfArr = 0;

        for (int ele : arr) {

            sumOfArr += ele;


        }

        return sumOfN - sumOfArr;



    }

    public static void main(String[] args) {

        // missing number (leeTCode->268)

        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
