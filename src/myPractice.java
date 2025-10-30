import java.util.HashMap;

public class myPractice {


    static String func(String s, String t) {

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


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String s1 = "ABCDE";
        String t = "ABC";
        String t1 = "AB";
        System.out.println(func(s, t));


    }


}

