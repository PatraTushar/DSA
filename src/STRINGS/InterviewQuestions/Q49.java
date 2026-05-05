package STRINGS.InterviewQuestions;

public class Q49 {

    static String addSpaces(String s, int[] spaces) {

        // Time Complexity: O(m+n)
        // Space Complexity: O(m+n)

        int n = s.length();
        StringBuilder result = new StringBuilder();

        int j = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (j < spaces.length && i == spaces[j]) {

                result.append(" ");
                j++;
            }

            result.append(ch);
        }

        return result.toString();


    }

    public static void main(String[] args) {

        // leeTCode->2109

        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(s, spaces));
    }
}
