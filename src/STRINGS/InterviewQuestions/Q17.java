package STRINGS.InterviewQuestions;

public class Q17 {

    static boolean repeatedSubstringPattern(String s) {

        // Time Complexity:  O(n²)
        // Space Complexity: O(n)

        int length = s.length();

        for (int i = length / 2; i >= 1; i--) {

            if (length % i == 0) {

                int times = length / i;
                String pattern = s.substring(0, i);
                String newString = "";

                while (times > 0) {

                    newString += pattern;
                    times--;

                }

                if (newString.equals(s)) return true;


            }


        }

        return false;


    }


    static boolean repeatedSubstringPatternI(String s) {

        // Time Complexity:  O(n)
        // Space Complexity: O(n)

        String doubled=s+s;
        String trimmed=doubled.substring(1,doubled.length()-1);
        return trimmed.contains(s);


    }


    public static void main(String[] args) {

        // leeTCode->459

        String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
        System.out.println(repeatedSubstringPatternI(s));


    }
}
