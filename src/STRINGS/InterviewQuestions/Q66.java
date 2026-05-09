package STRINGS.InterviewQuestions;

public class Q66 {

    static String decodeCiphertext(String encodedText, int rows) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int length = encodedText.length();
        int columns = length / rows;

        StringBuilder originalText = new StringBuilder();

        for (int col = 0; col < columns; col++) {

            for (int j = col; j < length; j += (columns + 1)) {

                originalText.append(encodedText.charAt(j));

            }

        }


        while (originalText.length() > 0 && originalText.charAt(originalText.length() - 1) == ' ') {

            originalText.deleteCharAt(originalText.length() - 1);
        }

        return originalText.toString();


    }

    public static void main(String[] args) {

        // leeTCode->2075

        String encodeText = "ch   ie   pr";
        int rows = 3;
        System.out.println(decodeCiphertext(encodeText, rows));

    }
}
