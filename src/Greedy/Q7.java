package Greedy;

import java.util.HashMap;

public class Q7 {

    static String reverse(String s) {

        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();


    }


    static int longestPalindrome(String[] words) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(n)

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        boolean centerUsed = false;
        int result = 0;


        for (String word : words) {


            if (map.get(word) == 0) continue;

            String rev = reverse(word);

            if (!rev.equals(word)) {       // ab->ba

                if (map.getOrDefault(word, 0) > 0 && map.getOrDefault(rev, 0) > 0) {

                    result += 4;
                    map.put(word, map.get(word) - 1);
                    map.put(rev, map.get(rev) - 1);
                }


            } else {   // aa->aa


                if (map.get(word) >= 2) {

                    result += 4;
                    map.put(word, map.get(word) - 2);
                } else if (map.get(word) == 1 && !centerUsed) {

                    result += 2;
                    map.put(word, map.get(word) - 1);
                    centerUsed = true;
                }


            }
        }

        return result;


    }


    public static void main(String[] args) {


        // leeTCode->2131

        String[] words = {"lc", "cl", "gg"};
        System.out.println(longestPalindrome(words));


    }
}
