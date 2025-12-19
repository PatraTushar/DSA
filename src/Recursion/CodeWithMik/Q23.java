package Recursion.CodeWithMik;

public class Q23 {

    static char findKthBit(int n, int k) {

        //  Time Complexity (TC): O(n)
        //  Space Complexity (SC): O(n)

        if (n == 1) return '0';

        int length = (1 << n) - 1;
        int half = (length + 1) / 2;

        char ch;
        if (k == half) return '1';
        else if (k < half) ch = findKthBit(n - 1, k);
        else {
            ch = findKthBit(n - 1, length - k + 1);
            return ch == '1' ? '0' : '1';


        }

        return ch;


    }

    public static void main(String[] args) {

        // leeTCode->1545

        int n = 4;
        int k = 11;
        System.out.println(findKthBit(n, k));

    }
}
