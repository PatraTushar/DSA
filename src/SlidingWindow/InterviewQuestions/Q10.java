package SlidingWindow.InterviewQuestions;

public class Q10 {


    static int findMax(String answerKey) {

        int n = answerKey.length();
        int length = 0;
        int i = 0;

        int result = 0;

        while (i < n) {

            if (answerKey.charAt(i) == 'T') {

                length = 1;
                i++;

                while (i < n && answerKey.charAt(i) == 'T') {
                    length++;
                    i++;
                }

                result = Math.max(result, length);
            } else {

                length = 1;
                i++;

                while (i < n && answerKey.charAt(i) == 'F') {
                    length++;
                    i++;
                }

                result = Math.max(result, length);
            }
        }

        return result;
    }

    static int solve(int index, String answerKey, int k) {

        int result = findMax(answerKey);

        if (index >= answerKey.length() || k <= 0) {
            return result;
        }

        char ch = answerKey.charAt(index);

        char flipChar = ch == 'T' ? 'F' : 'T';

        String flipped =
                answerKey.substring(0, index)
                        + flipChar
                        + answerKey.substring(index + 1);

        int flip = solve(index + 1, flipped, k - 1);

        int notFlip = solve(index + 1, answerKey, k);

        return Math.max(result, Math.max(flip, notFlip));
    }

    static int maxConsecutiveAnswers(String answerKey, int k) {

        // Time Complexity: O(n⋅2^n)
        // Space Complexity: O(n^2)

        return solve(0, answerKey, k);
    }


    static int maxConsecutiveAnswersI(String answerKey, int k) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = answerKey.length();

        int result = 0;
        int countTrue = 0;
        int countFalse = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            if (answerKey.charAt(right) == 'T') countTrue++;
            else countFalse++;

            while (Math.min(countTrue, countFalse) > k) {

                if (answerKey.charAt(left) == 'T') countTrue--;
                else countFalse--;

                left++;


            }

            result = Math.max(result, right - left + 1);


        }

        return result;

    }


    public static void main(String[] args) {

        // leeTCode->2024

        String answerKey = "TTFF";
        int k = 2;
        System.out.println(maxConsecutiveAnswers(answerKey, k));


    }
}
