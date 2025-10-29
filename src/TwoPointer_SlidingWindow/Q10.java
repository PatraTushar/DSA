package TwoPointer_SlidingWindow;

public class Q10 {

    static int characterReplacement(String s, int k) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(26)=O(1)

        int n = s.length();
        int longest = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                int index = s.charAt(j) - 'A';
                freq[index]++;
                maxFreq = Math.max(maxFreq, freq[index]);

                int changes = (j - i + 1) - maxFreq;

                if (changes <= k) {

                    longest = Math.max(longest, j - i + 1);

                } else break;


            }

        }

        return longest;


    }


    // BETTER APPROACH
    static int characterReplacementI(String s, int k) {

        int n = s.length();
        int longest = 0;
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < n; right++) {

            int rightIndex = s.charAt(right) - 'A';
            freq[rightIndex]++;
            maxFreq = Math.max(maxFreq, freq[rightIndex]);

            int changes = (right - left + 1) - maxFreq;

            if (changes <= k) {

                longest = Math.max(longest, right - left + 1);

            } else {


                while (changes > k) {

                    int leftIndex = s.charAt(left) - 'A';
                    freq[leftIndex]--;
                    left++;

                    int newMax = 0;
                    for (int t = 0; t < 26; t++) {
                        newMax = Math.max(newMax, freq[t]);
                    }
                    maxFreq = newMax;

                    changes = (right - left + 1) - maxFreq;

                }

                longest = Math.max(longest, right - left + 1);


            }


        }

        return longest;
    }


    // OPTIMAL APPROACH
    static int characterReplacementII(String s, int k) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(26)=O(1)


        int n = s.length();
        int longest = 0;
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < n; right++) {

            int rightIndex = s.charAt(right) - 'A';
            freq[rightIndex]++;
            maxFreq = Math.max(maxFreq, freq[rightIndex]);

            int changes = (right - left + 1) - maxFreq;

            if (changes > k) {

                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;
                left++;


            }

            longest = Math.max(longest, right - left + 1);


        }

        return longest;

    }


    public static void main(String[] args) {

        // leeTCode->424

        String s = "AABABBA";
        int k = 2;
        System.out.println(characterReplacement(s, k));
        System.out.println(characterReplacementI(s, k));
    }
}
