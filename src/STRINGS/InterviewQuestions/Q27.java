package STRINGS.InterviewQuestions;

public class Q27 {

    static boolean isVowel(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;

        return false;
    }

    static int beautifulSubstrings(String s, int k) {

        // Time Complexity: O(n²)
        // Space Complexity: O(1)

        int n = s.length();
        int count = 0;


        for (int i = 0; i < n; i++) {

            int vowels = 0;
            int consonants = 0;

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);

                if (isVowel(ch)) vowels++;

                else consonants++;

                if (vowels == consonants) {

                    int x = vowels;

                    if ((x * x) % k == 0) count++;


                }
            }


        }

        return count;


    }


    public static void main(String[] args) {

        // leeTCode->2947

        String s = "baeyh";
        int k = 2;
        System.out.println(beautifulSubstrings(s, k));
    }
}
