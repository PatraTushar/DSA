package strings.InterviewQuestions;

public class Q7 {

    static String makeGood(String s) {

        // Time Complexity: O(n)
        //Space Complexity: O(n)

        StringBuilder result = new StringBuilder();

        char[] ch = s.toCharArray();

        for (char character : ch) {

            int length = result.length();

            if (length > 0 && Math.abs(result.charAt(length - 1) - character) == 32) {

                result.deleteCharAt(length - 1);


            } else {

                result.append(character);

            }

        }

        return result.toString();


    }

    public static void main(String[] args) {

        String s = "leEeetcode";
        String Ans = makeGood(s);
        System.out.println(Ans);


    }
}
