

public class myPractice {

    static int count(int curr, int next, int n) {

        int totalCount = 0;

        while (curr <= n) {

            totalCount += next - curr;

            curr *= 10;
            next *= 10;
        }

        return totalCount;


    }

    static int findKthNumber(int n, int k) {

        int curr = 1;
        k--;

        while (k > 0) {


            int currPrefixCount = count(curr, curr + 1, n);

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


    public static void main(String[] args) {

        int n=22;
        int k=14;
        System.out.println(findKthNumber(n,k));

    }

}

