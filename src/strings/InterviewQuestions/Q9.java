package strings.InterviewQuestions;

import java.util.Arrays;

public class Q9 {

    static boolean closeStrings(String word1,String word2){

         // leeTCode->1657

        //Time Complexity: O(N + 26 log 26) → O(N)
        //Space Complexity: O(1)

        if(word1.length()!=word2.length()) return false;

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(char ch:word1.toCharArray()) {

            freq1[ch-'a']++;
        }

        for(char ch:word2.toCharArray()){

            freq2[ch-'a']++;
        }


        for(int i=0;i<26;i++){

            if(freq1[i]==0 && freq2[i]!=0 || freq1[i]!=0 && freq2[i]==0){

                return false;

            }

        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);


        return Arrays.equals(freq1,freq2);





    }

    public static void main(String[] args) {

        // leeTCode->1657

        String word1="cabbba";
        String word2="abbccc";

        System.out.println(closeStrings(word1,word2));
    }
}
