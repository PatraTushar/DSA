package DSAPractice;

public class Q12 {

    static boolean subArrayWithEqualSum(int[] arr) {

        int totalSum = 0;
        for (int ele : arr) {
            totalSum += ele;
        }

        int currSum = 0;
        for (int ele : arr) {

            currSum += ele;

            if (currSum==(totalSum-currSum)) return true;

        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 6, 3, 1};
        System.out.println(subArrayWithEqualSum(arr));


    }
}
