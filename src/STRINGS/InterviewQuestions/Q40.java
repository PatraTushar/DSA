package STRINGS.InterviewQuestions;

public class Q40 {

    static int findGCD(int a, int b) {

        if (b == 0) return a;

        return findGCD(b, a % b);
    }


    static String fractionAddition(String expression) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int numerator = 0;
        int denominator = 1;

        int i = 0;
        int n = expression.length();

        while (i < n) {

            int currNumerator = 0;
            int currDenominator = 0;

            boolean isNegative = expression.charAt(i) == '-';

            // Skip '+' or '-'
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') i++;


            // Build the current numerator
            while (i < n && Character.isDigit(expression.charAt(i))) {

                int val = expression.charAt(i) - '0';
                currNumerator = (currNumerator * 10) + val;
                i++;


            }

            i++;  // Skip the division character '/'

            if (isNegative) currNumerator *= -1;   // Apply negative sign if needed


            // Build the current denominator
            while (i < n && Character.isDigit(expression.charAt(i))) {

                int val = expression.charAt(i)-'0';
                currDenominator = (currDenominator * 10) + val;
                i++;
            }

            // Update the accumulated numerator and denominator
            numerator = numerator * currDenominator + currNumerator * denominator;
            denominator = denominator * currDenominator;


        }

        int gcd = findGCD(Math.abs(numerator), denominator);

        numerator /= gcd;
        denominator /= gcd;


        return numerator + "/" + denominator;


    }


    public static void main(String[] args) {

        // leeTCode->592

        String expression = "-1/2+1/2";
        System.out.println(fractionAddition(expression));
    }
}
