package STRINGS.InterviewQuestions;

public class Q34 {

    static String customSortString(String order, String s) {

        // Time Complexity: O(m+n+26)->O(m+n)
        // Space Complexity: O(1)

        int m = order.length();
        int n = s.length();

        StringBuilder sb = new StringBuilder();


        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {

            freq[s.charAt(i) - 'a']++;
        }


        for (int i = 0; i < m; i++) {

            char ch = order.charAt(i);

            if (freq[ch - 'a'] > 0) {

                while (freq[ch - 'a'] > 0) {

                    sb.append(ch);
                    freq[ch - 'a']--;

                }
            }
        }

        for (int i = 0; i < 26; i++) {

            while (freq[i] > 0) {

                char ch = (char) (i + 'a');
                sb.append(ch);
                freq[i]--;
            }
        }

        return sb.toString();


    }


    public static void main(String[] args) {

        // leeTCode->791

        String order = "cba";
        String s = "abcd";
        System.out.println(customSortString(order, s));
    }
}
