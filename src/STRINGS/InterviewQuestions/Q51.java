package STRINGS.InterviewQuestions;

public class Q51 {

    static boolean canChange(String start, String target) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int n = start.length();


        int i = 0;
        int j = 0;

        while (i < n || j < n) {

            while (i < n && start.charAt(i) == '_') i++;

            while (j < n && target.charAt(j) == '_') j++;

            if (i == n || j == n) return i == n && j == n;

            if (start.charAt(i) != target.charAt(j)) return false;

            if (start.charAt(i) == 'L' && i < j) return false;

            if (start.charAt(i) == 'R' && i > j) return false;

            i++;
            j++;
        }

        return true;


    }


    public static void main(String[] args) {

        // leeTCode->2337

        String start="_L__R__R_";
        String target="L______RR";

        System.out.println(canChange(start,target));


    }
}
