package SlidingWindow.InterviewQuestions;

public class Q1 {

    static boolean allZero(int[] freq) {

        for (int ele : freq) {

            if (ele != 0) return false;
        }

        return true;
    }


    static int search(String text, String pattern) {

        // Time Complexity: O(m*26)~O(m)
        // Space Complexity: O(1)


        int n = pattern.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {

            char ch = pattern.charAt(i);
            freq[ch - 'a']++;
        }


        int left = 0;
        int m = text.length();
        int result = 0;

        for (int right = 0; right <m ; right++) {

            int index = text.charAt(right) - 'a';
            freq[index]--;

            if (right - left + 1 == n) {

                if (allZero(freq)) result++;

                freq[text.charAt(left)-'a']++;
                left++;

            }


        }


        return result;

    }

    public static void main(String[] args) {

        String text = "forxxorfxdofr";
        String pattern = "for";
        System.out.println(search(text, pattern));


    }
}
