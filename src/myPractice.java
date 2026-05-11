import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {

    static int[] findLps(String s) {

        int n = s.length();

        int[] lps = new int[n];
        lps[0] = 0;

        int i = 1;
        int length = 0;

        while (i < n) {

            if (s.charAt(i) == s.charAt(length)) {

                length++;
                lps[i] = length;
                i++;
            } else {

                if (length != 0) length = lps[length - 1];


                else {

                    lps[i] = 0;
                    i++;
                }
            }


        }


        return lps;

    }


    public static void main(String[] args) {

        String s = "AAABBCAAA";
        int[] ans = findLps(s);
        System.out.println(Arrays.toString(ans));


    }
}





