package Greedy;

public class Q19 {

    static boolean winnerOfGame(String colors) {


        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        char[] colorsArr = colors.toCharArray();
        int n = colorsArr.length;

        int aliceSteps = 0;
        int bobSteps = 0;


        for (int i = 1; i < n - 1; i++) {

            char ch = colors.charAt(i);

            if (ch == 'A' && colorsArr[i - 1] == ch && colorsArr[i + 1] == ch) aliceSteps++;

            else if (ch == 'B' && colorsArr[i - 1] == ch && colorsArr[i + 1] == ch) bobSteps++;

        }


        while (aliceSteps > 0 && bobSteps > 0) {

            aliceSteps--;
            bobSteps--;


        }


        if (aliceSteps == 0) return false;


        return true;


    }

    public static void main(String[] args) {

        String s = "AABBBBBBAAA";
        System.out.println(winnerOfGame(s));
    }
}
