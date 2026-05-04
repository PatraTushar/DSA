package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q43 {

    static boolean areSentencesSimilar(String sentence1, String sentence2) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int m = sentence1.length();
        int n = sentence2.length();

        if (m < n) return areSentencesSimilar(sentence2, sentence1);


        List<String> vec1 = new ArrayList<>();
        List<String> vec2 = new ArrayList<>();


        vec1 = Arrays.asList(sentence1.split(" "));  // split(" ") -> creates a new String array and stores each cut (word) inside that array
        vec2 = Arrays.asList(sentence2.split(" "));


        int i = 0, j = vec1.size() - 1;
        int k = 0, l = vec2.size() - 1;

        while (i < vec1.size() && k < vec2.size() && vec1.get(i).equals(vec2.get(k))) {

            i++;
            k++;
        }

        while (j >= i && l >= k && vec1.get(j).equals(vec2.get(l))) {

            j--;
            l--;


        }

        return l < k;


    }

    public static void main(String[] args) {

        // leeTCode->1813

        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
}
