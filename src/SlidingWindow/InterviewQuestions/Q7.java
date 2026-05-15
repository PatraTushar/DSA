package SlidingWindow.InterviewQuestions;

public class Q7 {

    static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static int maxVowels(String s, int k) {


        // Time Complexity: O(n)
        // Space Complexity: O(1)



        int n = s.length();
        int left = 0;
        int maxVowel = 0;
        int vowelSeen = 0;
        for (int right = 0; right < n; right++) {

            if (isVowel(s.charAt(right))) vowelSeen++;

            if (right - left + 1 > k) {

                if (isVowel(s.charAt(left))) vowelSeen--;
                left++;
            }


            if (right - left + 1 == k) {

                maxVowel = Math.max(maxVowel, vowelSeen);
            }


        }

        return maxVowel;


    }

    public static void main(String[] args) {

        // leeTCode->1456

        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));


    }
}
