package SlidingWindow.InterviewQuestions;

public class Q38 {

    static int countKConstraintSubstrings(String s, int k) {

        // Time Complexity (TC): O(n^2)
        //Space Complexity (SC): O(1)

        int n = s.length();

        int result = 0;

        for (int i = 0; i < n; i++) {

            int count0 = 0;
            int count1 = 0;

            for (int j = i; j < n; j++) {

                if (s.charAt(j) == '0') count0++;
                else count1++;

                if (count0 <= k || count1 <= k) result++;
                else break;
            }
        }

        return result;
    }

    static int countKConstraintSubStringI(String s, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = s.length();

        int result = 0;
        int count0 = 0;
        int count1 = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '0') count0++;
            else count1++;

            while (count0 > k && count1 > k) {

                if (s.charAt(left) == '0') count0--;
                else count1--;

                left++;
            }

            result += (right - left + 1);


        }

        return result;
    }


    public static void main(String[] args) {

        // leeTCode->3258

        String s = "1010101";
        int k = 2;
        System.out.println(countKConstraintSubStringI(s,k));
    }
}
