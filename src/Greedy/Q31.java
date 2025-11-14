package Greedy;

import java.util.*;

public class Q31 {

    static int leastInterval(char[] tasks, int n) {

        //  Time Complexity: O(n + k log k + k)= O(n)
        //  Space Complexity: O(k) = O(1) // k is the number of unique element


        int length = tasks.length;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {

            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        int size = list.size();

        int maxFreq = list.get(0).getValue();
        int holes = maxFreq - 1;
        int idleSpots = holes * n;
        list.get(0).setValue(0);


        for (int i = 1; i < size; i++) {


            int freq = list.get(i).getValue();

            idleSpots -= Math.min(freq, holes);

            if (idleSpots <= 0) return length;


        }

        return length + idleSpots;


    }

    public static void main(String[] args) {

        // leeTCode->621


        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}
