import java.util.HashMap;
import java.util.Stack;

public class myPractice {

    static int func(String s, int k) {

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

        String s = "AABABBA";
        System.out.println(func(s, 2));


    }


}

