package SlidingWindow.InterviewQuestions;

public class Q17 {

    static int equalSubstring(String s, String t, int maxCost) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = s.length();

        int maxLength = 0;
        int cost = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            int rightDiff = Math.abs(s.charAt(right) - t.charAt(right));
            cost += rightDiff;

            while (cost > maxCost) {

                int leftDiff = Math.abs(s.charAt(left) - t.charAt(left));
                cost -= leftDiff;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);


        }

        return maxLength;


    }

    public static void main(String[] args) {

        // leeTCode->1208

        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;

        System.out.println(equalSubstring(s, t, maxCost));


    }
}
