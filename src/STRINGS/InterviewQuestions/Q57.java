package STRINGS.InterviewQuestions;

public class Q57 {

    static int minLength(String s) {


        // Time Complexity: O(n)
        // Space Complexity: O(26)~O(1)

        int n = s.length();

        int[] freq = new int[26];
        int deleted = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;

            if (freq[ch - 'a'] == 3) {

                freq[ch - 'a'] -= 2;
                deleted += 2;


            }

        }

        return n - deleted;


    }

    public static void main(String[] args) {

        // leeTCode->3223

        String s = "abaacbcbb";
        System.out.println(minLength(s));

    }
}
