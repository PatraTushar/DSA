package STRINGS.InterviewQuestions;

public class Q21 {

    static String decodeAtIndex(String s, int k) {

        // Time Complexity:  O(n)
        // Space Complexity: O(1)

        int n = s.length();
        long size = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                size += 1;
            } else {

                int digit = ch - '0';

                size *= digit;
            }
        }


        for (int i = n - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            k%=size;

            if (k == 0 && Character.isLetter(ch)) return Character.toString(ch);


            if (Character.isLetter(ch)) {

                size -= 1;
            } else {

                int digit = ch - '0';
                size /= digit;
            }

        }


        return "";


    }

    public static void main(String[] args) {

        // leeTCode->880

        String s = "leet2code3";
        int k = 10;
        System.out.println(decodeAtIndex(s, k));

    }
}
