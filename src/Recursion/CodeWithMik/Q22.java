package Recursion.CodeWithMik;

public class Q22 {

    static char kthCharacter(long k, int[] operations) {

        //  Time Complexity (TC): O(n.log k)
        //  Space Complexity (SC): O(log k)

        if (k == 1) return 'a';

        long length = 1;
        int operationType = 0;
        long newK = k;

        for (int i = 0; i < operations.length; i++) {

            length *= 2;

            if (length >= k) {

                operationType = operations[i];
                newK = k - length / 2;
                break;
            }

        }

        char ch = kthCharacter(newK, operations);

        if (operationType == 1)  return ch == 'z' ? 'a' : (char) (ch + 1);

        return ch;



    }

    public static void main(String[] args) {

        // leeTCode->3307

        long k = 10;
        int[] operations = {0, 1, 0, 1};
        System.out.println(kthCharacter(k,operations));
    }
}
