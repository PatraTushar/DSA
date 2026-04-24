package STRINGS.InterviewQuestions;

public class Q10 {

    static boolean detectCapitalUse(String word) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int length = word.length();

        int capital = 0;
        int small = 0;

        for (int i = 0; i < length; i++) {

            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') capital++;
            else small++;


        }


        if (capital == length || small == length) return true;


        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {

            for (int i = 1; i < length; i++) {

                if (word.charAt(i)>='A' && word.charAt(i)<='Z') return false;
            }

            return true;


        }

        return false;


    }

    public static void main(String[] args) {

        // leeTCode->520

        String word = "USA";
        System.out.println(detectCapitalUse(word));


    }
}
