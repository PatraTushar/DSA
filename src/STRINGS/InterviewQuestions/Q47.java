package STRINGS.InterviewQuestions;

public class Q47 {

    static String compressedString(String word) {


        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = word.length();
        StringBuilder comp = new StringBuilder();

        int i = 0;

        while (i < n) {

            char ch = word.charAt(i);
            int count = 0;

            while (i < n && count < 9 && word.charAt(i) == ch) {

                count++;
                i++;
            }

            comp.append(count).append(ch);


        }

        return comp.toString();


    }

    public static void main(String[] args) {

        // leeTCode->3163

        String word = "abcde";
        System.out.println(compressedString(word));


    }
}
