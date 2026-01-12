package Recursion.CodeWithMik;

public class Q31 {

    static int minUnfairness(int[] cookies, int k, int index, int[] children, int result) {


        if (index >= cookies.length) {

            int unfairness = 0;
            for (int i = 0; i < k; i++) {

                unfairness = Math.max(unfairness, children[i]);
            }

            return Math.min(result, unfairness);

        }

        int cookie = cookies[index];

        for (int i = 0; i < k; i++) {

            if (children[i] + cookie >= result) continue;

            children[i] += cookie;
            result = minUnfairness(cookies, k, index + 1, children, result);
            children[i] -= cookie;

            if (children[i] == 0) break;
        }

        return result;


    }


    static int distributeCookies(int[] cookies, int k) {

        //  Time Complexity (TC): O(k^n)
        //  Space Complexity (SC): O(n+k)


        return minUnfairness(cookies, k, 0, new int[k], Integer.MAX_VALUE);


    }


    public static void main(String[] args) {

        int[] cookies = {9,8,7,6};
        int k = 2;
        System.out.println(distributeCookies(cookies, k));


    }
}
