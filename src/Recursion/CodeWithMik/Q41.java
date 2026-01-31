package Recursion.CodeWithMik;


import java.util.HashSet;
import java.util.Map;

public class Q41 {

    static int solve(String s, int start, HashSet<String> set) {

        if (start == s.length()) return set.size();

        int max=0;

        for (int end = start + 1; end <= s.length(); end++) {

            String subString=s.substring(start,end);

            if (!set.contains(subString)){

                set.add(subString);
                int nextPath=solve(s,end,set);
                max= Math.max(max,nextPath);
                set.remove(subString);
            }


        }

        return max;
    }

    static int maxUniqueSplit(String s) {

        //  Time Complexity (TC): O( 2^n)
        //  Space Complexity (SC): O(n^2)

        return solve(s,0,new HashSet<>());

    }

    public static void main(String[] args) {

        // leeTCode->1593

        String s="ababccc";
        System.out.println(maxUniqueSplit(s));


    }
}
