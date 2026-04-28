package STRINGS.InterviewQuestions;

public class Q20 {

    static String removeDuplicateLetters(String s) {

        // Time Complexity:  O(n)
        // Space Complexity: O(1)

        int n = s.length();
        int[] lastIndex = new int[26];
        boolean[] taken = new boolean[26];


        StringBuilder result = new StringBuilder();


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            lastIndex[ch - 'a'] = i;


        }


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            int index = ch - 'a';

            if (taken[index]) continue;

            while (!result.isEmpty() && result.charAt(result.length() - 1) > ch && lastIndex[result.charAt(result.length() - 1)-'a'] > i) {

                char lastChar = result.charAt(result.length() - 1);

                taken[lastChar-'a'] = false;
                result.deleteCharAt(result.length() - 1);

            }

            result.append(ch);
            taken[index]=true;
        }

        return result.toString();


    }

    public static void main(String[] args) {

        //leeTCode->316

        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));

    }
}
