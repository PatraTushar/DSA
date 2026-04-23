package STRINGS.InterviewQuestions;

public class Q1 {


    static int compress(char[] chars) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int length = chars.length;
        int index = 0;
        int i = 0;

        if (length == 1) return length;


        while (i < length) {

            char currChar = chars[i];
            int count = 0;

            while (i < length && currChar == chars[i]) {
                i++;
                count++;
            }

            chars[index++] = currChar;

            if (count > 1) {

                String countString = Integer.toString(count);

                for (int j = 0; j < countString.length(); j++) {

                    chars[index++] = countString.charAt(j);
                }

            }


        }

        return index;

    }


    public static void main(String[] args) {

        // leeTCode->443

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));

    }
}
