package SlidingWindow.InterviewQuestions;

public class Q37 {

    static int minFlipsRequired(String s) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(2*n)

        int n = s.length();

        StringBuilder alternate1 = new StringBuilder();
        StringBuilder alternate2 = new StringBuilder();

        for (int i = 0; i < 2 * n; i++) {

            alternate1.append(i % 2 == 0 ? '0' : '1');
            alternate2.append(i % 2 == 0 ? '1' : '0');

        }

        int flip1 = 0;
        int flip2 = 0;
        int result = Integer.MAX_VALUE;

        int left = 0;

        for (int right = 0; right < 2 * n; right++) {


            // Expand The Window

            if (s.charAt(right % n) != alternate1.charAt(right)) flip1++;
            if (s.charAt(right % n) != alternate2.charAt(right)) flip2++;


            // Shrink Window (maintain window size = n)

            if (right - left + 1 > n) {

                if (s.charAt(left % n) != alternate1.charAt(left)) flip1--;
                if (s.charAt(left % n) != alternate2.charAt(left)) flip2--;

                left++;
            }

            if (right - left + 1 == n) result = Math.min(result, Math.min(flip1, flip2));

        }

        return result;

    }

    static int minFlips(String s) {

        // Time Complexity (TC): O(2n) ~ O(n)
        //Space Complexity (SC): O(n)

        int n = s.length();

        int flip1 = 0;
        int flip2 = 0;

        int result = Integer.MAX_VALUE;

        int left = 0;

        for (int right = 0; right < 2*n; right++) {

            // Expand The Window

            char expectedCharS1 = right % 2 == 0 ? '0' : '1';
            char expectedCharS2 = right % 2 == 0 ? '1' : '0';

            if (s.charAt(right % n) != expectedCharS1) flip1++;
            if (s.charAt(right % n) != expectedCharS2) flip2++;

            // Shrink The Window
            if (right - left + 1 > n) {

                expectedCharS1 = (left % 2 == 0) ? '0' : '1';
                expectedCharS2 = (left % 2 == 0) ? '1' : '0';

                if (s.charAt(left % n) !=expectedCharS1) flip1--;
                if (s.charAt(left % n) !=expectedCharS2) flip2--;

                left++;
            }


            if (right-left+1==n) result=Math.min(result,Math.min(flip1,flip2));


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->1888

        String s = "111000";
        System.out.println(minFlips(s));

    }
}
