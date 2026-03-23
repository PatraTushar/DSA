package ARRAYS.binarySearchPattern;

public class Q19 {

    static int squareRoot(int x) {

        // Time Complexity: O(log x)
        // Space Complexity: O(1)


        int low = 1;
        int high = x;


        while (low <= high) {

            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == x) return mid;

            else if (square > x) high = mid - 1;

            else low = mid + 1;

        }

        return high;

    }

    public static void main(String[] args) {

        int x = 11;
        System.out.println(squareRoot(x));

    }

}
