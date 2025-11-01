package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

    static boolean isPalindrome(String s, int start, int end) {

        while (start <= end) {

            if (s.charAt(start) != s.charAt(end)) {

             return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static List<List<String>> solve(String s,int partitionIndex,List<String> ans,List<List<String>> result){

        if(partitionIndex==s.length()){

            result.add(new ArrayList<>(ans));
            return result;
        }

        for(int i=partitionIndex;i<s.length();i++){

            if(isPalindrome(s,partitionIndex,i)){

               ans.add(s.substring(partitionIndex,i+1));

               solve(s,i+1,ans,result);

               ans.remove(ans.size()-1);


            }
        }

        return result;
    }

    public static List<List<String>> partition(String s){

        // Time Complexity: O(2^n * n)
        // Space Complexity: O(n)

        List<List<String>> result=new ArrayList<>();
        solve(s,0,new ArrayList<>(),result);

        return result;


    }

    public static void main(String[] args) {

        String s="aab";
        List<List<String>> ans=partition(s);
        System.out.println(ans);




    }
}
