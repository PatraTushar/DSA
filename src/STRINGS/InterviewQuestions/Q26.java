package STRINGS.InterviewQuestions;

import java.util.HashSet;

public class Q26 {

    static String findDifferentBinaryString(String[] num) {


        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = num.length;

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {

            char ch = num[i].charAt(i);

            if (ch == '0') sb.append('1');
            else sb.append('0');


        }

        return sb.toString();


    }


    public static void main(String[] args) {

        // leeTCode->1980

        String[] num = {"111", "011", "001"};
        System.out.println(findDifferentBinaryString(num));
    }
}
