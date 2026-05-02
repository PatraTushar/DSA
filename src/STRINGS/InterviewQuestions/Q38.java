package STRINGS.InterviewQuestions;

public class Q38 {

    static int appendCharacters(String s, String t) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int m = s.length();
        int n = t.length();


        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }

        return n-j;


    }

    public static void main(String[] args) {

        // leeTCode->2486

        String s = "coaching";
        String t = "coding";
        System.out.println(appendCharacters(s, t));
    }
}
