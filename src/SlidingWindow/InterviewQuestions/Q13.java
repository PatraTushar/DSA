package SlidingWindow.InterviewQuestions;

public class Q13 {

    public static int solve(int start, int end, String word, int k) {

        int result = 0;

        int size = end - start + 1;

        for (int unique_char = 1; unique_char <= 26 && unique_char * k <= size; unique_char++) {

            int[] count = new int[26];
            int goodChars = 0; // How many chars are of frequency char


            // Now do sliding window;

            int left = start;
            int windowLength = unique_char * k;

            for (int right = start; right <= end; right++) {

                char ch = word.charAt(right);

                count[ch - 'a']++;

                if (count[ch - 'a'] == k) goodChars++;

                else if (count[ch - 'a'] == k + 1) goodChars--;

                if (right - left + 1 > windowLength) {

                    char leftChar = word.charAt(left);

                    if (count[leftChar - 'a'] == k) goodChars--;

                    else if (count[leftChar - 'a'] ==k + 1)goodChars++;

                    count[word.charAt(left) - 'a']--;
                    left++;


                }

                if (goodChars == unique_char) result++;


            }


        }

        return result;


    }

    static int countCompleteSubstrings(String word, int k) {

        // Time Complexity (TC): O(26 × n)
        //Space Complexity (SC): O(26)

        int n = word.length();
        int result = 0;
        int last = 0;

        for (int i = 1; i <= n; i++) {

            if (i == n || Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {

                result += solve(last, i - 1, word, k);
                last = i;
            }
        }

        return result;


    }

    public static void main(String[] args) {

        String word = "igigee";
        int k = 2;
        System.out.println(countCompleteSubstrings(word, k));


    }
}
