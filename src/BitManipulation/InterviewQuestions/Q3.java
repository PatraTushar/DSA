package BitManipulation.InterviewQuestions;

public class Q3 {

    static int singleNumber(int[] arr){

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        int unique=0;
        int n=arr.length;

        for(int i=0;i<n;i++){

            unique^=arr[i];
        }

        return unique;
    }

    public static void main(String[] args) {

        // leeTCode->136

        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));


    }
}
