package SlidingWindow.InterviewQuestions;

public class Q14 {

    static int numSubArrayProductLessThanK(int[] num, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        if (k <= 1) return 0;

        int n = num.length;
        int product = 1;
        int result = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            product *= num[right];

            while (product >= k) {
                product /= num[left];
                left++;

            }


            result += (right - left + 1);


        }

        return result;


    }


    public static void main(String[] args) {

        // leeTCode->713

        int[] num = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubArrayProductLessThanK(num, k));

    }
}
