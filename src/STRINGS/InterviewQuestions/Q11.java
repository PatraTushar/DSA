package STRINGS.InterviewQuestions;

public class Q11 {

    static int minDeletionSize(String[] strs) {

        // Time Complexity: O(rows * cols)
        // Space Complexity: O(1)

        int rows = strs.length;
        int cols = strs[0].length();
        int deleted = 0;

        for (int i = 0; i < cols; i++) {

            for (int j = 1; j < rows; j++) {

                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    deleted++;
                    break;
                }
            }


        }

        return deleted;


    }


    public static void main(String[] args) {

        //leeTCode->944

        String[] str = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(str));


    }
}
