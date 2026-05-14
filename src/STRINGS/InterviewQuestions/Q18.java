package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q18 {

    static String getFinalWord(int i, int j, int spacesBetweenWords, int extraSpace, int maxWidth, String[] words) {

        StringBuilder sb = new StringBuilder();

        for (int k = i; k < j; k++) {

            sb.append(words[k]);

            if (k == j - 1) continue;


            for (int space = 1; space <= spacesBetweenWords; space++) {

                sb.append(" ");


            }

            if (extraSpace > 0) {
                sb.append(" ");
                extraSpace--;
            }


        }

        while (sb.length()<maxWidth){
            sb.append(" ");
        }

        return sb.toString();

    }


    static List<String> fullJustify(String[] words, int maxWidth) {


       // Time Complexity: O(n * maxWidth)
        //Space Complexity: O(n * maxWidth)

        int n = words.length;
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < n) {

            int letterCount = words[i].length();
            int spaceSlot = 0;
            int j = i + 1;

            while (j < n && spaceSlot + letterCount + words[j].length() + 1 <= maxWidth) {

                letterCount += words[j].length();
                spaceSlot++;
                j++;
            }


            int remainingSlots = maxWidth - letterCount;

            int spacesBetweenWords = (spaceSlot == 0) ? 0 : remainingSlots / spaceSlot;
            int extraSpace = (spaceSlot == 0) ? 0 : remainingSlots % spaceSlot;


            if (j == n) {

                spacesBetweenWords = 1;
                extraSpace = 0;
            }

            result.add(getFinalWord(i, j, spacesBetweenWords, extraSpace, maxWidth, words));
            i = j;


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->68

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> ans = fullJustify(words, maxWidth);
        System.out.println(ans);


    }
}
