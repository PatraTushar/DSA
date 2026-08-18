package HEAPS.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q2 {


    static class Pair {

        char ch;
        int frequency;

        Pair(char ch, int frequency) {

            this.ch = ch;
            this.frequency = frequency;
        }
    }


    static String frequencySort(String s) {

        // Time Complexity:O(n log n)
        // Space Complexity:O(n)

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        // Max-heap based on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.frequency - p1.frequency);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            pq.offer(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder result = new StringBuilder();


        while (!pq.isEmpty()) {

            Pair temp = pq.poll();

            for (int i = 0; i < temp.frequency; i++) {
                result.append(temp.ch);
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {

        // leeTCode->451



        String s = "tree";
        System.out.println(frequencySort(s));

    }
}
