package TwoPointer_SlidingWindow;

import java.util.HashMap;


public class Q14 {


    // BRUTEFORCE APPROACH
    static String minWindow(String s, String t) {

        //  Time Complexity: O(m² * n)
        //  Space Complexity: O(n)    where n is the length of the t string

        int m = s.length();
        int n = t.length();
        int minLength = Integer.MAX_VALUE;
        int startingIndex = -1;


        for (int i = 0; i < m; i++) {

            HashMap<Character, Integer> mapForT = new HashMap<>();
            int count = 0;

            for (int j = 0; j < n; j++) {

                char ch = t.charAt(j);
                mapForT.put(ch, mapForT.getOrDefault(ch, 0) + 1);

            }


            for (int j = i; j < m; j++) {

                char ch = s.charAt(j);

                if (mapForT.containsKey(ch) && mapForT.get(ch) != 0) {

                    count++;
                    mapForT.put(ch, mapForT.get(ch) - 1);

                    if (count == n) {

                        int length = j - i + 1;

                        if (length < minLength) {

                            minLength = length;
                            startingIndex = i;
                            break;
                        }
                    }
                }

            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startingIndex, minLength + startingIndex);


    }


    // OPTIMAL APPROACH
    static String minWindowI(String s, String t) {

        //  Time Complexity: O(m)+O(n)=O(m+n)
        //  Space Complexity: O(n)

        int m = s.length();
        int n = t.length();
        int minLength = Integer.MAX_VALUE;
        int startingIndex = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        for (int right = 0; right < m; right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) > 0) count++;

            if (map.containsKey(ch)) map.put(ch, map.get(ch) - 1);

            while (count == n) {

                int length = right - left + 1;

                if (length < minLength) {

                    minLength = length;
                    startingIndex = left;
                }


                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);

                    if (map.get(s.charAt(left)) > 0) count--;

                }


                left++;


            }


        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startingIndex, minLength + startingIndex);


    }


    public static void main(String[] args) {
        // leeTCode->76

        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
        System.out.println(minWindowI(s, t));

    }
}
