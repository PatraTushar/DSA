package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q13 {

    static boolean isConcatenated(String words, HashSet<String> set) {

        int length = words.length();

        for (int i = 0; i < length; i++) {

            String prefix = words.substring(0, i + 1);
            String suffix = words.substring(i + 1);

            if ((set.contains(prefix) && set.contains(suffix)) || (set.contains(prefix) &&isConcatenated(suffix,set))){

                return true;
            }
        }

        return false;

    }


    static List<String> findAllConcatenatedWordsInADict(String[] words) {

        int n = words.length;

        HashSet<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (String str : words) {

            set.add(str);
        }

        for (int i = 0; i < n; i++) {

            String currWord = words[i];

            if (isConcatenated(currWord, set)) {

                result.add(currWord);

            }
        }

        return result;


    }

    public static void main(String[] args) {

        //leeTCode->472

        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> ans = findAllConcatenatedWordsInADict(words);
        System.out.println(ans);

    }
}
