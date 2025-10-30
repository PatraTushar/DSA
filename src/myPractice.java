import java.util.HashMap;

public class myPractice {


    static String func(String s, String t) {

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
        String s = "ADOBECODEBANC";
        String s1 = "ABCDE";
        String t = "ABC";
        String t1 = "AB";
        System.out.println(func(s, t));


    }


}

