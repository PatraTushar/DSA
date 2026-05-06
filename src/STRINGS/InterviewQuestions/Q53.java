package STRINGS.InterviewQuestions;

public class Q53 {

    static String repeatLimiteString(String s, int repeatLimit) {

        // Time Complexity: O(n)
        // Space Complexity: O(26)~O(1)


        int n = s.length();
        StringBuilder result = new StringBuilder();
        int[] count = new int[26];


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        int i = 25;

        while (i >= 0) {

            if (count[i] == 0) {
                i--;
                continue;
            }


            char currChar = (char) (i + 'a');
            int frequency = count[i];

            int allowedRepeat = Math.min(frequency, repeatLimit);

            for (int k = 0; k < allowedRepeat; k++) {
                result.append(currChar);
            }

            count[i] -= allowedRepeat;

            if (count[i] > 0) {

                int j = i - 1;

                while (j >= 0 && count[j] == 0) {
                    j--;
                }

                if (j < 0) break;

                result.append((char) (j + 'a'));
                count[j]--;


            }


        }

        return result.toString();


    }


    public static void main(String[] args) {

        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimiteString(s, repeatLimit));


    }
}
