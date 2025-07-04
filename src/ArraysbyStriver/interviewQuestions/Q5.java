package ArraysbyStriver.interviewQuestions;

public class Q5 {

    static int findUnique(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int unique=0;

        for(int a:arr){

            unique^=a;

        }

        return unique;

    }

    public static void main(String[] args) {

        // Q: find the unique number in the given array where all the elements are being repeated twice with one value being unique

        int[] arr={1,2,3,4,2,1,3};
        System.out.println(findUnique(arr));

    }
}
