package STRINGS.InterviewQuestions;

public class Q3 {

    static String countAndSay(int n) {

        // Time Complexity: O(2ⁿ)
        // Space Complexity: O(2ⁿ)

        if (n == 1) return "1";

        String say = countAndSay(n - 1);

        StringBuilder res = new StringBuilder();
        int i = 0;


        while (i < say.length()) {

            char currChar = say.charAt(i);
            int count = 0;

            while (i < say.length() && say.charAt(i) == currChar) {

                count++;
                i++;
            }

            res.append(count).append(currChar);

        }

        return res.toString();

    }

    public static void main(String[] args) {

        // leeTCode->38

        int n = 4;
        String s = countAndSay(n);
        System.out.println(s);


    }
}
