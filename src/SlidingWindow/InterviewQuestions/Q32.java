package SlidingWindow.InterviewQuestions;

public class Q32 {

    static int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n+1)->O(n)


        int n = startTime.length;

        // Create A Gap Array

        int[] free = new int[n + 1];

        free[0] = startTime[0];

        for (int i = 1; i < n; i++) {

            free[i] = startTime[i] - endTime[i - 1];
        }


        free[n] = eventTime - endTime[n - 1];

        int left = 0;
        int currSum = 0;
        int result = 0;
        int length = free.length;

        for (int right = 0; right < length; right++) {

            // Expand the window;
            currSum += free[right];

            // window becomes invalid
            while (right - left + 1 > k + 1) {

                currSum -= free[left];
                left++;
            }

            result = Math.max(result, currSum);

        }

        return result;

    }


    public static void main(String[] args) {

        // leeTCode->3439

        int eventTime = 10;
        int k = 1;
        int[] startTime = {0, 2, 9};
        int[] endTime = {1, 4, 10};

        System.out.println(maxFreeTime(eventTime, k, startTime, endTime));


    }
}
