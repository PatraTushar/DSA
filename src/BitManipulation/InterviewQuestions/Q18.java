package BitManipulation.InterviewQuestions;

import java.util.HashMap;

public class Q18 {


    // BRUTE FORCE APPROACH
    static int wonderfulSubstrings(String str) {

        int count = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {

            //  Time Complexity: O(n²)
            //  Space Complexity: O(10)->O(1)

            HashMap<Character, Integer> map = new HashMap<>();
            int oddCount=0;


            for (int j = i; j < n; j++) {

                char ch=str.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if(map.get(ch)%2==0){

                    oddCount--;
                }

                else oddCount++;

                if(oddCount<=1) count++;




            }



        }

        return count;


    }

    public static void main(String[] args) {


        String word = "aabb";
        System.out.println(wonderfulSubstrings(word));

    }
}
