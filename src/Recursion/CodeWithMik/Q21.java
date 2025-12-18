package Recursion.CodeWithMik;

public class Q21 {

    static char kthCharacter(int k) {

        //  Time Complexity (TC): O(k)
        //  Space Complexity (SC): O(k)

        String word = "a";


        while (word.length() < k) {

            int length = word.length();

            for (int i = 0; i < length; i++) {

                char ch = word.charAt(i);

                if (ch == 'z') word = word + 'a';
                else word = word + (char) (ch + 1);


            }


        }

        return word.charAt(k - 1);

    }

    static char kthCharacterI(int k) {

        //  Time Complexity (TC): O(1)
        //  Space Complexity (SC): O(1)

        int increment = Integer.bitCount(k - 1);

        return  (char) ('a' + increment);

    }


    public static void main(String[] args) {

        // leeTCode->3304

        int k = 5;
        System.out.println(kthCharacter(k));
        System.out.println(kthCharacterI(k));


    }
}
