import java.util.Arrays;

public class myPractice {


    static int[] func(int[] arr) {

        int n = arr.length;

        int NthSum = n * (n + 1) / 2;
        int sqrOfNthSum = n * (n + 1) * (2 * n + 1) / 6;
        int sumOfArr = 0;
        int sqrSumOfArr = 0;

        for (int ele : arr) {

            sumOfArr += ele;
            sqrSumOfArr += ele * ele;

        }


        int val1 = NthSum - sumOfArr;
        int val2 = sqrOfNthSum - sqrSumOfArr;
        val2 = val2 / val1;

        int x = (val1 + val2) / 2;
        int y = x - val1;

        return new int[]{x, y};

    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] ans=func(arr);
        System.out.println(Arrays.toString(ans));


    }
}








