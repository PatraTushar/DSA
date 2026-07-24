package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q20 {

    static int minSwaps(int[] num) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = num.length;

        int totalOnes = (int) Arrays.stream(num).filter(ele -> ele == 1).count();

        if (totalOnes <= 1) return 0;

        int currWindowOnes = 0;

        // first window

        for (int i = 0; i < totalOnes; i++) {

            if (num[i] == 1) currWindowOnes++;
        }


        int maxOneInWindow = currWindowOnes;

        int left = 0;

        for (int right = totalOnes; right < n + totalOnes; right++) {


            if (num[left % n] == 1) currWindowOnes--;

            if (num[right%n]==1) currWindowOnes++;

            maxOneInWindow=Math.max(maxOneInWindow,currWindowOnes);

            left++;

        }

        return totalOnes-maxOneInWindow;


    }


    public static void main(String[] args) {

           // leeTCode->2134

        int[] num = {0, 1, 0, 1, 1, 0, 0};
        System.out.println(minSwaps(num));


    }
}
