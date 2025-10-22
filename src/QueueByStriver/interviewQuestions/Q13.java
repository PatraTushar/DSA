package QueueByStriver.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q13 {

    static String firstRepeatingCharacter(String str) {

        // Time Complexity: O(n)
        //Space Complexity: O(1)


        int n = str.length();
        int[] count = new int[25];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            q.add(ch);
            count[ch - 'a']++;

            if (count[q.peek() - 'a'] == 1) {

                sb.append(q.peek());

            } else {

                while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {

                    q.poll();
                }

                if (q.isEmpty()) sb.append('#');
                else sb.append(q.peek());

            }


        }


        return sb.toString();


    }

    public static void main(String[] args) {

        String str = "ababdc";
        System.out.println(firstRepeatingCharacter(str));

    }
}
