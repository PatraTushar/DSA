package Recursion.CodeWithMik;

import java.util.*;

public class Q39 {

    static void solve(String s, int start, Set<String> dict, List<String> path, List<String> result) {

        if (start == s.length()) {

            result.add(String.join(" ", path));
            return;
        }


        for (int end = start + 1; end <= s.length(); end++) {

            String word=s.substring(start,end);

            if (dict.contains(word)){

                path.add(word);
                solve(s,end,dict,path,result);
                path.remove(path.size()-1);
            }
        }


    }


    static List<String> wordBreak(String s, List<String> wordDict) {

        //  Time Complexity (TC): O(n * 2^n)   n = length of the string s.   2^n = all possible ways to split s.
        //  Space Complexity (SC): O(n * 2^n)

        List<String> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);
        solve(s,0,dict,new ArrayList<>(),result);

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->140

        String s="catsanddog";
        List<String> wordDict= Arrays.asList("cat","cats","and","sand","dog");
        List<String> ans=wordBreak(s,wordDict);
        System.out.println(ans);

    }
}
