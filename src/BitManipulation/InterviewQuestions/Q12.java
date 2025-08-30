package BitManipulation.InterviewQuestions;

public class Q12 {



    static int maximumXorProduct(long a,long b,int n){

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        final int MOD = 1_000_000_007;
        long ax = (a >> n) << n; // Keep higher bits unchanged
        long bx = (b >> n) << n;

        for (int i = n - 1; i >= 0; i--) {
            long aBit = (a >> i) & 1;
            long bBit = (b >> i) & 1;

            if (aBit == bBit) {
                // If bits are equal, set both to 1
                ax |= 1L << i;
                bx |= 1L << i;
            } else {
                // If bits are different, set 1 to the smaller number
                if (ax < bx) {
                    ax |= 1L << i;
                } else {
                    bx |= 1L << i;
                }
            }
        }

        return (int) ((ax % MOD) * (bx % MOD) % MOD);
    }

    public static void main(String[] args) {

        // leeTCode->2939

        long a=12;
        long b=5;
        int n=4;

        System.out.println(maximumXorProduct(a,b,n));
    }
}
