import java.util.HashMap;
import java.util.Stack;

public class myPractice {

    static int func(String s) {

        int maxLength = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            if (!map.isEmpty() && (map.containsKey(ch) && map.get(ch) >= left)) {

                left = map.get(ch) + 1;
                map.put(ch, right);


            } else {

                map.put(ch, right);


            }

            int length = right - left + 1;
            maxLength = Math.max(length, maxLength);


        }

        return maxLength;


    }

    public static void main(String[] args) {


        String s = "cadbzabcd";
        System.out.println(func(s));


    }


}

