package Greedy;

import java.util.HashMap;

public class Q10 {

    static int minimumRounds(int[] tasks) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(k)  where k is number of distinct tasks


        HashMap<Integer, Integer> map = new HashMap<>();
        int rounds = 0;

        for (int ele : tasks) {

            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }


        for (int key : map.keySet()) {


            if (map.get(key) == 1) return -1;

            else if (map.get(key) % 3 == 0) rounds += map.get(key) / 3;

            else rounds += (map.get(key) / 3) + 1;


        }

        return rounds;

    }

    public static void main(String[] args) {

        // leeTCode->2244

        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        System.out.println(minimumRounds(tasks));

    }
}
