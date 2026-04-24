package STRINGS.InterviewQuestions;

public class Q8 {

    static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    static boolean halvesAreAlike(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int length = s.length();

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < length; i++) {

            char ch = s.charAt(i);

            if (i < length / 2) {

                if (isVowel(ch)) count1++;
            } else {

                if (isVowel(ch)) count2++;
            }

        }

        return count1 == count2;


    }

    public static void main(String[] args) {

        // leeTCode->1704

        String s = "book";
        System.out.println(halvesAreAlike(s));


    }
}
