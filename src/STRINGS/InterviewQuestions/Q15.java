package STRINGS.InterviewQuestions;

public class Q15 {

    static boolean buddyStrings(String s, String goal) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = s.length();

        if (s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            int[] freq = new int[26];

            for (int i = 0; i < n; i++) {

                char ch = s.charAt(i);

                freq[ch - 'a']++;

                if (freq[ch - 'a'] > 1) return true;


            }
        }


        int index1 = -1;
        int index2 = -1;


        for (int i = 0; i < n; i++) {

            if (s.charAt(i)!=goal.charAt(i)){

                if (index1==-1) index1=i;
                else if (index2==-1)index2=i;
                else return false;
            }
        }

        if (index2==-1) return false;

        return s.charAt(index1)==goal.charAt(index2) &&s.charAt(index2)==goal.charAt(index1);


    }

    public static void main(String[] args) {

        //leeTCode->859

        String s = "ab";
        String goal = "ba";
        System.out.println(buddyStrings(s, goal));
    }
}
