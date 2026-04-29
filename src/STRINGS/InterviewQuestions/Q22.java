package STRINGS.InterviewQuestions;

public class Q22 {


    static void reverse(char[] result, int i, int j) {

        while (i < j) {

            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;

            i++;
            j--;
        }
    }

    static String reverseWords(String s) {

        // Time Complexity:  O(n)
        // Space Complexity: O(n)

        int n = s.length();

        char[] result = s.toCharArray();

        for (int i = 0; i < n; i++) {

            if (result[i] != ' ') {

                int j = i;

                while (j + 1 < n && result[j + 1] != ' ') {

                    j++;
                }

                reverse(result, i, j);
                i = j;
            }


        }

        return new String(result);


    }

    public static void main(String[] args) {

        // leeTCode->557

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));


    }
}
