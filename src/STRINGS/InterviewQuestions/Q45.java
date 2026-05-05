package STRINGS.InterviewQuestions;

import java.util.Arrays;

public class Q45 {

    static int maximumSwap(int num) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        String s = Integer.toString(num);
        int n = s.length();

        int[] maxRight = new int[10];

        Arrays.fill(maxRight, -1);

        for (int i = 0; i < n; i++) {

            int idx = s.charAt(i) - '0';

            maxRight[idx] = i;
        }


        for (int i = 0; i < n; i++) {

            int currDigit = s.charAt(i) - '0';

            for (int digit = 9; digit > currDigit; digit--) {

                if (maxRight[digit] > i) {

                    char[] charArray=s.toCharArray();
                    char temp=charArray[i];
                    charArray[i]=charArray[maxRight[digit]];
                    charArray[maxRight[digit]]=temp;

                    return Integer.parseInt(new String(charArray));



                }





            }
        }

        return num;


    }

    public static void main(String[] args) {

        // leeTCode->670

        int num = 2736;
        System.out.println(maximumSwap(num));
    }
}
