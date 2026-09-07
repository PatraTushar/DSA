package DSAPractice;

public class Q35 {

    static int squareRoot(int x) {

        int low = 0;
        int high = x;


        while (low <= high) {

            int mid = low + (high - low) / 2;
            int midSquare = mid * mid;

            if (midSquare == x) return mid;

            else if (midSquare > x) high = mid - 1;
            else low = mid + 1;


        }

        return high;
    }

    public static void main(String[] args) {

        int x = 11;
        System.out.println(squareRoot(x));
    }
}
