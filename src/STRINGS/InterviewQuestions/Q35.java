package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q35 {

    static String[] shortestSubstrings(String[] arr) {

        // Time Complexity: O(N × L³)
        // Space Complexity: O(N × L²)

        // N = number of strings in arr
        // L = average length of each string

        ArrayList<String> result = new ArrayList<>();

        HashMap<String, Integer> unique_substring = new HashMap<>();


        for (String str : arr) {

            HashSet<String> seen = new HashSet<>();


            for (int i = 0; i < str.length(); i++) {

                for (int j = i + 1; j <= str.length(); j++) {

                    String substring = str.substring(i, j);

                    if (!seen.contains(substring)) {

                        unique_substring.put(substring, unique_substring.getOrDefault(substring, 0) + 1);
                        seen.add(substring);
                    }
                }


            }

        }


        for (String str : arr) {

            String shortest = "";

            for (int i = 0; i < str.length(); i++) {

                for (int j = i + 1; j <= str.length(); j++) {

                    String substring = str.substring(i, j);


                    if (unique_substring.get(substring) == 1 && (shortest.equals("") || substring.length() < shortest.length() || (substring.length() == shortest.length() && substring.compareTo(shortest) < 0))) {

                        shortest = substring;
                    }
                }
            }

            result.add(shortest);
        }


        return result.toArray(new String[0]);

    }


    public static void main(String[] args) {

        // leeTCode->3076

        String[] arr = {"cab", "ad", "bad", "c"};
        String[] ans = shortestSubstrings(arr);
        System.out.println(Arrays.toString(ans));

    }
}
