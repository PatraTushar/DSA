package RecursionByStriver.StriverPlaylist.BasicRecursionProblem;

public class MultipleRecursionCalls {

    static int fibonacciNumber(int n){

        //Time Complexity (TC): O(2ⁿ)
        //Space Complexity (SC): O(n) (due to recursion stack in worst case)

        if(n==0 || n==1) return n;

        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacciNumber(7));


    }
}
