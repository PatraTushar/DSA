package STRINGS.InterviewQuestions;

public class Q16 {

    static int largestVariance(String s) {

        // Time Complexity: O(26 × 26 × n) ≈ O(n)
        // Space Complexity: O(26) ≈ O(1)**


        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int result = 0;

        for (char first = 'a'; first <= 'z'; first++) {

            for (char second = 'a'; second <= 'z'; second++) {

                if (freq[first - 'a'] == 0 || freq[second - 'a'] == 0) continue;

                int firstCount=0;
                int secondCount=0;

                boolean pastSecond=false;

                for (char ch:s.toCharArray()){

                    if (ch==first) firstCount++;

                     if (ch==second) secondCount++;

                    if (secondCount>0) result=Math.max(result,firstCount-secondCount);

                    else {

                        if (pastSecond){

                            result=Math.max(result,firstCount-1);
                        }
                    }

                    if (secondCount>firstCount){
                        secondCount=0;
                        firstCount=0;

                        pastSecond=true;
                    }
                }


            }
        }

        return result;

    }

    public static void main(String[] args) {

        //leeTCode->2272

        String s = "aababbb";
        System.out.println(largestVariance(s));


    }
}


// 👉 For every pair of two different characters (first, second),
//we try to find a substring where:
//
//both characters appear at least once
//and the value (count of first − count of second) is maximum