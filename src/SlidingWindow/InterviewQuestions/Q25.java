package SlidingWindow.InterviewQuestions;

public class Q25 {

    static int takeCharacters(String s, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = s.length();

        int a = 0, b = 0, c = 0;

        for (Character ch : s.toCharArray()) {

            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else c++;
        }


        if (a < k || b < k || c < k) return -1;

        int left = 0;
        int notDeletedWindowSize = 0;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            if (ch == 'a') a--;
            else if (ch == 'b') b--;
            else c--;


            while (a < k || b < k || c < k) {

                if (s.charAt(left) == 'a') a++;
                else if (s.charAt(left) == 'b') b++;
                else c++;

                left++;
            }


            notDeletedWindowSize=Math.max(notDeletedWindowSize,right-left+1);
        }

        return n-notDeletedWindowSize;


    }

    public static void main(String[] args) {

        // leeTCode->2516

        String s = "aabaaaacaabc";
        int k = 2;
        System.out.println(takeCharacters(s, k));


    }
}
