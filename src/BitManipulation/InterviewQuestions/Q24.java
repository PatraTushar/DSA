package BitManipulation.InterviewQuestions;

public class Q24 {

    static int largestCombination(int[] candidates) {

        // Time Complexity : O(n * 32)  -> O(n)
        // Space Complexity : O(1)

        int maxGroup = 0;


        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {


            int count = 0;


            for (int ele : candidates) {

                int bit = (ele >> bitPosition) & 1;
                if (bit > 0) count++;


            }

            maxGroup = Math.max(maxGroup, count);

        }

        return maxGroup;


    }

    public static void main(String[] args) {

        // leeTCode->2275

        int[] candidates = {16, 17, 71, 62, 12, 24, 14};
        System.out.println(largestCombination(candidates));
    }
}
