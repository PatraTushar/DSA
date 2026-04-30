package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q29 {

    static int numberOfWays(String corridor) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = corridor.length();
        List<Integer> seatPosition = new ArrayList<>();

        int MOD = 1000000007;

        for (int i = 0; i < n; i++) {

            char ch = corridor.charAt(i);

            if (ch == 'S') seatPosition.add(i);


        }

        if (seatPosition.size() == 0 || seatPosition.size() % 2 != 0) return 0;

        long result = 1;

        int prev = seatPosition.get(1);

        for (int i = 2; i < seatPosition.size(); i += 2) {

            int length = seatPosition.get(i)- prev;

            result=(result*length)%MOD;

            prev=seatPosition.get(i+1);

        }

        return (int) result;
    }


    public static void main(String[] args) {

        // leeTCode->2147

        String s="SPSPPSPPSPPSS";
        System.out.println(numberOfWays(s));


    }
}
