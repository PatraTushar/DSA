package Recursion.CodeWithMik;

public class Q12 {

    static boolean match(String s, String p, int i, int j) {
        // 1️⃣ If pattern is finished
        if (j == p.length()) {
            return i == s.length();
        }

        // 2️⃣ Check if current characters match
        boolean firstMatch =
                (i < s.length() &&
                        (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        // 3️⃣ If next pattern character is '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Case A: '*' means ZERO character
            // Case B: '*' means ONE or more characters
            return match(s, p, i, j + 2) ||
                    (firstMatch && match(s, p, i + 1, j));
        }

        // 4️⃣ Normal case (no '*')
        return firstMatch && match(s, p, i + 1, j + 1);

    }


    static boolean isMatch(String s, String p) {

        return match(s, p,0,0);


    }


    public static void main(String[] args) {

        String s = "abb";
        String p = ".*b";
        System.out.println(isMatch(s, p));

    }
}
