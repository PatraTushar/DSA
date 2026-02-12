package QUEUE.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q13 {

    static String firstNonRepeatingCharacter(String s) {

        // Time Complexity: O(n)
        //Space Complexity: O(n) + O(1) = O(n)

        int n = s.length();
        int[] count = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

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
        System.out.println(firstNonRepeatingCharacter(str));

    }
}
