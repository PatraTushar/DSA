package Recursion.CodeWithMik;

public class Q20 {

    static int findKthNumber(int n, int k) {

        //  Time Complexity (TC): O((log n)²)
        //  Space Complexity (SC): O(n)


        int curr = 1;
        k--;

        while (k > 0) {

            int currPrefixCount = countNumberInLevels(curr, curr + 1, n);

            if (currPrefixCount <= k) {

                curr++;
                k -= currPrefixCount;


            } else {

                curr *= 10;
                k--;


            }

        }

        return curr;


    }


    static int countNumberInLevels(long curr, long next, int n) {

        int countNumber = 0;

        while (curr <= n) {

            countNumber += (next - curr);

            curr *= 10;
            next *= 10;
            next = Math.min(next, (long) n + 1);


        }

        return countNumber;


    }


    public static void main(String[] args) {

        // leeTCode->440

        int n = 22;
        int k = 14;
        System.out.println(findKthNumber(n, k));


    }
}
