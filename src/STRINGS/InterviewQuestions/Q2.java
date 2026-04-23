package STRINGS.InterviewQuestions;

public class Q2 {

    static boolean checkIfPangram(String sentence) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int length = sentence.length();
        int[] freq = new int[26];

        for (int i = 0; i < length; i++) {

            char ch = sentence.charAt(i);
            int index = ch - 'a';

            freq[index]++;
        }

        for (int ele : freq) {

            if (ele == 0) return false;
        }

        return true;


    }

    public static void main(String[] args) {

        //leeTCode->1832

        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }
}
