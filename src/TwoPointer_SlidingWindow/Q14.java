package TwoPointer_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Q14 {


    // BRUTEFORCE APPROACH
    static String minWindow(String s, String t) {

        //  Time Complexity: O(m² * n)
        //  Space Complexity: O(n)    where nis the length of the t string


        int m = s.length();
        int n = t.length();
        int sIndex = -1;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {

            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;

            for (int j = 0; j < n; j++) {

                map.put(t.charAt(j), map.getOrDefault(t.charAt(j), 0) + 1);
            }

            for (int j = i; j < m; j++) {

                if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) > 0) {
                    count++;
                    map.put(s.charAt(j), map.get(s.charAt(j)) - 1);

                }

                if (count == n) {

                    if (j - i + 1 < minLength) {
                        minLength = j - i + 1;
                        sIndex = i;
                        break;
                    }
                }
            }


        }

        if (sIndex == -1) return "";

        return s.substring(sIndex, minLength + sIndex);
    }


    // OPTIMAL APPROACH
    static String minWindowI(String s, String t) {

        //  Time Complexity: O(m)+O(n)=O(m+n)
        //  Space Complexity: O(n)

        int m = s.length();
        int n = t.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {

            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }




        for(int right=0;right<m;right++){

            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))>0){

                count++;
            }

            if (map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
            }



            while (count==n){

                if(right-left+1<minLength){

                    minLength=right-left+1;
                    startIndex=left;
                }

                if(map.containsKey(s.charAt(left)) ){

                    map.put(s.charAt(left),map.get(s.charAt(left))+1);

                    if(map.get(s.charAt(left))>0) count--;


                }

                left++;
            }
        }

        return startIndex==-1 ? "" :s.substring(startIndex,startIndex+minLength);


    }


    public static void main(String[] args) {
        // leeTCode->76

        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
        System.out.println(minWindowI(s, t));

    }
}
