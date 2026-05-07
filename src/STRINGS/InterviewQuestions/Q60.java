package STRINGS.InterviewQuestions;

public class Q60 {

    static String answerString(String word, int numFriends) {

        // Time Complexity: O(n * m)
        // Space Complexity: O(m)

        // n=Total length of the string     m=Maximum length of substring you are considering

        if (numFriends == 1) return word;

        int n = word.length();
        int m = n - (numFriends - 1);

        String res = "";

        for (int i = 0; i < n; i++) {

            String current = word.substring(i, Math.min(n, i + m));

            if (current.compareTo(res) > 0) {
                res = current;
            }
        }

        return res;

    }


    public static void main(String[] args) {

        // leeTCode->3403

        String word = "dbca";
        int numFriends = 2;
        System.out.println(answerString(word, numFriends));
    }
}


// Expression	Meaning
//< 0	        result is smaller than candidate
//0             	both strings are equal
//> 0	         result is greater than candidate