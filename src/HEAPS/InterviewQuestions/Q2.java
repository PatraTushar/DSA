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



// 1)Create a HashMap to store each character and its frequency.
//2)Traverse the input string character by character.
//3)For each character, increase its frequency in the HashMap.
//4)Create a Max-Heap based on character frequency.
//5)Insert each character and its frequency from the HashMap into the Max-Heap.
//6)The Max-Heap keeps the character with the highest frequency at the top.
//7)Create a StringBuilder to store the final result.
//8)While the Max-Heap is not empty, remove the character with the highest frequency.
//9)Append that character to the result as many times as its frequency.
//10)Continue until the Max-Heap becomes empty.
//11)Return the resulting string.