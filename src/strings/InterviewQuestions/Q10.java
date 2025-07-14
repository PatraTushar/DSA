package strings.InterviewQuestions;

public class Q10 {

    static boolean detectCapitalUse(String s) {

        // Time Complexity: O(N)
        //Space Complexity: O(1)


        char[] ch = s.toCharArray();
        int uppercase = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) uppercase++;
        }


        if (uppercase == s.length()) return true;

        if (uppercase == 0) return true;


        if (uppercase == 1 && Character.isUpperCase(ch[0])) return true;


        return false;


    }

    public static void main(String[] args) {

        // leeTCode->520

        String word = "USA";
        System.out.println(detectCapitalUse(word));


    }
}
