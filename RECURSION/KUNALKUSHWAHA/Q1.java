package RECURSION.KUNALKUSHWAHA;


public class Q1 {

    static int fibonacciNumber(int n ){

        if(n==0 || n==1){
             return n;
        }

        int answer=fibonacciNumber(n-1) + fibonacciNumber(n-2);
        return answer;

    }

    public static void main(String[] args) {


        int ans=fibonacciNumber(4);


        System.out.println( ans );




    }
}
