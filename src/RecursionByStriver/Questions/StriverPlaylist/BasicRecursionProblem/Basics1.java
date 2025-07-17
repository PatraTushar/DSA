package RecursionByStriver.Questions.StriverPlaylist.BasicRecursionProblem;

public class Basics1 {

    // Product of n to 1

    public static int productFromNTo1(int n, int product) {

      // It is Parameterized Recursion

       // Time Complexity (TC): O(n)
      // Space Complexity (SC): O(n) — due to recursion stack.

        if (n < 0) throw new IllegalArgumentException("n must be ≥ 1");

        if (n==0) return product;


        return productFromNTo1(n - 1, product*n) ;


    }

    public static int productFromNTo1I(int n) {

        // It is Functional Recursion

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n) — due to recursion stack.

        if (n <= 0) throw new IllegalArgumentException("n must be ≥ 1");

        if(n==1) return 1;

        return productFromNTo1I(n-1) * n;


    }

    public static int sumFromNTo1(int n,int sum){

        // It is Parameterized Recursion

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n) — due to recursion stack.

        if (n < 0) throw new IllegalArgumentException("n must be ≥ 1");


        if(n==0) return sum;

        return sumFromNTo1(n-1,sum+n);
    }

    public static int sumFromNTo1I(int n){

        // It is Functional Recursion

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n) — due to recursion stack.

        if (n < 1) throw new IllegalArgumentException("n must be ≥ 1");


        if(n==1) return 1 ;

        return sumFromNTo1I(n-1) + n;
    }







    public static void main(String[] args) {

        System.out.println(productFromNTo1(5, 1));
        System.out.println(productFromNTo1I(5));
        System.out.println(sumFromNTo1(5,0));
        System.out.println(sumFromNTo1I(5));


    }
}
