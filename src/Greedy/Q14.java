package Greedy;

import java.util.LinkedList;
import java.util.Queue;

public class Q14 {


    static String predictPartyVictory(String senate) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(n)


        int n = senate.length();

        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if (senate.charAt(i) == 'R') radiant.add(i);
            else dire.add(i);
        }

        while (!dire.isEmpty() && !radiant.isEmpty()) {

            int dIndex = dire.poll();
            int rIndex = radiant.poll();

            if (dIndex < rIndex) dire.add(dIndex + n);

            else radiant.add(rIndex + n);

        }

        return dire.isEmpty() ? "Radiant" : "Dire";


    }

    public static void main(String[] args) {

        // leeTCode->649

        String s = "DRDRDR";
        System.out.println(predictPartyVictory(s));


    }
}
