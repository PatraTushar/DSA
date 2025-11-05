package Greedy;

import java.util.HashMap;

public class Q13 {

    static int partitionString(String s) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(26)=O(1)

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int substringStarts = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {

                map.put(ch, i);
            } else {

                if (map.get(ch) >= substringStarts) {

                    count++;
                    substringStarts = i;
                }

                map.put(ch, i);


            }


        }

        count++;

        return count;
    }

    public static void main(String[] args) {

        String s = "abacaba";
        System.out.println(partitionString(s));
    }
}
