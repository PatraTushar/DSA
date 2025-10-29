import java.util.HashMap;

public class myPractice {


    static String func(String s, String t) {

        int m = s.length();
        int n = t.length();
        HashMap<Character, Integer> mapForT = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int startingPoint = 0;
        int endingPoint = m - 1;


        for (int i = 0; i < m; i++) {

            HashMap<Character, Integer> map = new HashMap<>();
            int lastIndex = -1;

            for (int j = i; j < m; j++) {

                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                lastIndex = j;

            }

            boolean isValidString = true;

            for (int k = 0; k < n; k++) {

                char ch = t.charAt(k);
                if (!map.containsKey(ch)) {

                    isValidString = false;
                    break;
                }

            }

            if (isValidString) {


                int length = lastIndex - i + 1;

                if (length < minLength) {

                    minLength = length;
                    startingPoint = i;
                    endingPoint = lastIndex;

                }


            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startingPoint, endingPoint + 1);


    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(func(s, t));


    }


}

