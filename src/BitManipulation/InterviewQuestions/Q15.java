package BitManipulation.InterviewQuestions;

public class Q15 {


    // Brute force approach

    // TLE FOR LARGER K
    static long findMaximumNumber(long k, int x) {

        //  Time Complexity: O(K * 64)
        //  Space Complexity: O(1)


        long num = 1;
        long sum = 0;

        while (sum <= k) {

            int count = 0;

            for (int i = 1; i <= 64; i++) {

                long bit = (num >> (i - 1)) & 1;

                if (bit == 1 && (i % x == 0)) count++;


            }

            if (sum + count > k) break;

            sum += count;
            num++;


        }


        return num - 1;

    }


    static long contribution(long num, long pos) {

        long cycleLength = (long) Math.pow(2, pos);

        long completeCycle = num / cycleLength;
        long totalSetBits = completeCycle * (cycleLength / 2);


        long remainingLength = num % cycleLength;


        if (remainingLength >= cycleLength / 2) {

            totalSetBits += remainingLength - cycleLength / 2 + 1;
        }

        return totalSetBits;


    }

    static long findMaximumNumberI(long k, int x) {

        long start = 1;
        long end = 1000000000000000L;
        long ans = 0;

        while (start <= end) {

            long mid = start + (end - start) / 2;
            long price = 0;

            // Length of binary representation of number mid
            int length = (int) (Math.log(mid) / Math.log(2)) + 1;     //log2(mid)+1;

            // Total prices will ge the sum of contribution of every bit

            for (long pos = x; pos <= length; pos += x) {

                // This will give the count of set bits at a particular position in numbers ranging from 1 to n
                price += contribution(mid, pos);

            }

            if (price <= k) {

                ans = mid;
                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }

        return ans;


    }

    public static void main(String[] args) {

        // leeTCode->3007

        long k = 9;
        int x = 1;

        System.out.println(findMaximumNumber(k, x));
        System.out.println(findMaximumNumberI(7, 2));

    }
}
