package Greedy;

public class Q4 {

    static int brokenCalculator(int startValue, int target) {

        //  Time Complexity: O(log target)
        //  Space Complexity: O(1)

        int minOperation = 0;

        while (target > startValue) {

            if (target % 2 == 0) target /= 2;
            else target++;

            minOperation++;

        }

        return minOperation + (startValue - target);

    }

    public static void main(String[] args) {

        // leeTCode->991

        int startValue = 2;
        int target = 3;
        System.out.println(brokenCalculator(startValue, target));
    }
}
