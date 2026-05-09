package STRINGS.InterviewQuestions;

public class Q65 {

    // Time Complexity: O(rows*cols)
    // Space Complexity: O(rows)


    static int minDeletionSize(String[] strs) {

        int rows = strs.length;
        int cols = strs[0].length();
        int totalDeletion = 0;

        boolean[] alreadySorted = new boolean[rows];

        for (int col = 0; col < cols; col++) {

            boolean deleted = false;

            for (int row = 0; row < rows - 1; row++) {

                if (!alreadySorted[row] && strs[row].charAt(col) > strs[row + 1].charAt(col)) {

                    deleted = true;
                    totalDeletion++;
                    break;


                }
            }

            if (deleted) continue;

            for (int i = 0; i < rows - 1; i++) {

                alreadySorted[i] = alreadySorted[i] || strs[i].charAt(col) < strs[i + 1].charAt(col);
            }
        }

        return totalDeletion;


    }

    public static void main(String[] args) {

        // leeTCode->955

        String[] strs = {"ca", "bb", "ac"};
        System.out.println(minDeletionSize(strs));


    }
}
