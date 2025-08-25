package BitManipulation.InterviewQuestions;

public class Q7 {

    static int divide(int dividend, int divisor) {

        // Time Complexity: O(log(|dividend| / |divisor|))
        // Space Complexity: O(1)


        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

        long dd = Math.abs((long) dividend);
        long dv = Math.abs((long) divisor);

        int res = 0;

        while (dd>=dv) {

            long sum = dv;
            int count = 1;

            while (sum + sum <= dd) {


                sum += sum;
                count += count;
            }


            res += count;
            dd -= sum;


        }

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) return -res;

        return res;


    }

    public static void main(String[] args) {

        // leeTCode->29

        int dividend = 120;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
        System.out.println(divide(10, divisor));


    }
}
