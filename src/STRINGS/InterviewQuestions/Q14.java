package STRINGS.InterviewQuestions;

public class Q14 {

    static int strStr(String hayStack, String needle) {

        // Time Complexity: O(m*n)
        // Space Complexity: O(1)

        int m = hayStack.length();
        int n = needle.length();


        for (int i = 0; i <= m - n; i++) {

            for (int j = 0; j < n; j++) {

                if (hayStack.charAt(i + j) != needle.charAt(j)) break;

                if (j == n - 1) return i;
            }
        }

        return -1;


    }


    public static void main(String[] args) {


        //leeTCode->28

        String hayStack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(hayStack, needle));


    }
}
