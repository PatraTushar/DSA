package Greedy;



import java.util.HashMap;
import java.util.HashSet;

public class Q17 {

    static int minDeletions(String s) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(26)->O(1)

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        int deletion = 0;


        for (char key : map.keySet()) {

            int freq = map.get(key);

            while (freq > 0 && set.contains(freq)) {

                freq--;
                deletion++;

            }

            if (freq > 0) set.add(freq);
        }

        return deletion;


    }

    public static void main(String[] args) {

        // leeTCode->1647

        String s = "abcdabcd";
        System.out.println(minDeletions(s));
    }
}
