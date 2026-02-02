package ArraysbyStriver.interviewQuestions;

public class Q18 {

    static boolean subArrayWithEqualSum(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int prefix = 0;

        for (int i = 0; i < n; i++) {

            prefix += arr[i];


        }


        int suffix=0;

        for (int i=n-1;i>=0;i--){

            suffix+=arr[i];
            prefix-=arr[i];

            if (prefix==suffix) return true;
        }

        return false;


    }

    public static void main(String[] args) {

        // Q: check if we partition the array into 2 subArrays with equal sum

        int[] arr={5,3,2,6,3,1};
        System.out.println(subArrayWithEqualSum(arr));

    }
}
