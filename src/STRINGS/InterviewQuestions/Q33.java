package STRINGS.InterviewQuestions;

public class Q33 {

    static boolean check(String word, int i, int n) {

        return word.substring(i, n).equals(word.substring(0, n - i));


    }

    static int minimumTimeToInitialState(String word, int k) {

        // Time Complexity: O(n^2)
        // Space Complexity: O(1)


        int n = word.length();
        int i = k;
        int count = 1;

        while (i < n) {

            if (check(word, i, n)) break;

            count++;
            i += k;


        }

        return count;


    }


    static int[] findLPS(String s) {



        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int length = 0;

        int i = 1;

        while (i < n) {

            if (s.charAt(i) == s.charAt(length)) {

                length++;
                lps[i] = length;
                i++;


            } else {

                if (length != 0) length = lps[length - 1];

                else {

                    lps[i] = 0;
                    i++;
                }


            }
        }

        return lps;

    }


    static int minimumTimeToInitialStateI(String word, int k) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)


        int n = word.length();

        int[] lps = findLPS(word);

        int maxLPS = lps[n - 1];

        while (maxLPS > 0 && (n - maxLPS) % k != 0) {

            maxLPS = lps[maxLPS - 1];
        }


        if ((n - maxLPS) % k == 0) return (n - maxLPS) / k;


        return (int) Math.ceil(n / (double) k);


    }


    public static void main(String[] args) {


        // leeTCode->3029 & 3031

        String word = "abacaba";
        int k = 3;
        System.out.println(minimumTimeToInitialState(word, k));
        System.out.println(minimumTimeToInitialStateI(word, k));


    }
}
