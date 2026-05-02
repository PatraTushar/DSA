package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q39 {

    public static class Pair {

        int mappedNum;
        int originalIndex;

        Pair(int mappedNum, int originalIndex) {

            this.mappedNum = mappedNum;
            this.originalIndex = originalIndex;
        }

    }

    static String getMappedNum(String num, int[] mapping) {

        int n = num.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            char ch = num.charAt(i);
            sb.append(mapping[ch - '0']);


        }

        return sb.toString();


    }


    static int[] sortJumbled(int[] mapping, int[] num) {

        // Time Complexity: O(n log n + n.d)->O(n log n)
        // Space Complexity: O(n)

        // n = num.length
        //d = average number of digits in a number

        int n = num.length;

        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String numStr = Integer.toString(num[i]);
            String mappedString = getMappedNum(numStr, mapping);
            int mappedNum = Integer.parseInt(mappedString);
            list.add(new Pair(mappedNum, i));


        }


        Collections.sort(list, (a, b) -> Integer.compare(a.mappedNum, b.mappedNum));

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int originalIndex=list.get(i).originalIndex;
            result[i]=num[originalIndex];
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->2191

        int[] mapping = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] num = {991, 338, 38};
        int[] ans = sortJumbled(mapping, num);
        System.out.println(Arrays.toString(ans));
    }
}
