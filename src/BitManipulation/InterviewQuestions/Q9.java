package BitManipulation.InterviewQuestions;

import java.util.Arrays;

public class Q9 {

    static int[] countBits(int n) {

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)


        int[] result = new int[n + 1];


        for (int i = 0; i <= n; i++) {

            int count = 0;
            int x = i;

            while (x != 0) {

                int bit = x & 1;

                if (bit == 1) count++;

                x = x >> 1;


            }

            result[i] = count;

        }

        return result;
    }


    static int[] countBits1(int n) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)


        int[] result = new int[n + 1];



        for (int i =0; i <= n; i++) {


            if ((i & 1) == 0) {   // even

                result[i] = result[i >> 1];

            }

            else {  // odd

                result[i]=result[i>>1]+1;


            }
        }

        return result;
    }

    public static void main(String[] args) {

        // leeTCode->338

        int n = 2;
        int[] ans = countBits(n);
        System.out.println(Arrays.toString(ans));
        int[] ans1=countBits1(n);
        System.out.println(Arrays.toString(ans1));
    }
}
