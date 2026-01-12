package Recursion.CodeWithMik;

public class Q32 {

    static int minUnfairness(int[] cookies, int k, int index, int[] children, int result) {

        if (index >= cookies.length) {


        }


        int cookie = cookies[index];


        for (int i = 0; i < k; i++) {

            children[i] += cookie;
            minUnfairness(cookies,k,index+1,children,result);


        }


    }


    static int distributeCookies(int[] cookies, int k) {

        return minUnfairness(cookies, k, 0, new int[k], Integer.MAX_VALUE);


    }


    public static void main(String[] args) {

    }
}
