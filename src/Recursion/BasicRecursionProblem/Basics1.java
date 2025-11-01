package Recursion.BasicRecursionProblem;

public class Basics1 {


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


    public static int sumOfDigits(int n,int sum){

        // It is Parameterized Recursion

        // Time Complexity (TC): O(d)
        // Space Complexity (SC): O(d) — due to recursion stack.
        //Where d is the number of digits in n (since n is divided by 10 at each step).

        if(n==0) return sum;

         return sumOfDigits(n/10,sum+(n%10));


    }

    public static int sumOfDigitsI(int n){

        // It is Functional Recursion

        // Time Complexity (TC): O(d)
        // Space Complexity (SC): O(d) — due to recursion stack.
        //Where d is the number of digits in n (since n is divided by 10 at each step).

        if(n==0) return 0 ;

        return sumOfDigitsI(n/10)+n%10;


    }

    static int productOfDigits(int n,int product){

        // It is Parameterized Recursion

        // Time Complexity (TC): O(d)
        // Space Complexity (SC): O(d) — due to recursion stack.
        //Where d is the number of digits in n (since n is divided by 10 at each step).


        if(n==0) return product;

        return productOfDigits(n/10,product*(n%10));
    }

    static int productOfDigitsI(int n){

        // It is Functional Recursion

        // Time Complexity (TC): O(d)
        // Space Complexity (SC): O(d) — due to recursion stack.
        //Where d is the number of digits in n (since n is divided by 10 at each step).


        if(n==0) return 1;

        return productOfDigitsI(n/10)*(n%10);
    }



    static int reverseANumber(int n,int rev){

        // It is Parameterized Recursion

        // Time Complexity (TC): O(d)
        // Space Complexity (SC): O(d) — due to recursion stack.
        //Where d is the number of digits in n (since n is divided by 10 at each step).

        if(n==0) return rev;

        return reverseANumber(n/10,rev*10+(n%10));

    }

    static int reverseANumberI(int n){

        // It is Functional Recursion

        // Time Complexity (TC): O(d)
        // Space Complexity (SC): O(d) — due to recursion stack.
        //Where d is the number of digits in n (since n is divided by 10 at each step).

        return reverseANumber(n,0);
    }

    static boolean isPalindrome(String str,int i,int j){

           // It is Functional Recursion

      //  Time Complexity (TC): O(n)
      //  Space Complexity (SC): O(n)

        if(i>=j) return true;

        if(str.charAt(i)!=str.charAt(j)) return false;

        return  isPalindrome(str,i+1,j-1);
    }


    static int countZeroes(int num,int count){

        // It is Functional Recursion


        // Time Complexity (TC): O(d)
        //Space Complexity (SC): O(d)
        //Where d is the number of digits in num.

        if(num==0) return count;


        if(num%10==0) count++;

        return countZeroes(num/10,count);


    }


    static int countZeroesI(int num){

        // It is Functional Recursion


        // Time Complexity (TC): O(d)
        //Space Complexity (SC): O(d)
        //Where d is the number of digits in num.

       if(num==0) return 0;

       int count=num%10==0 ? 1 : 0;

       return countZeroesI(num/10)+count;





    }

    static int countSteps(int num){

        // It is Functional Recursion

        //Time Complexity (TC): O(log(n))
        //Space Complexity (SC): O(log(n))



        if(num==0) return 0;

        int count=1;

        if(num%2==0) num=num/2;
        else num=num-1;

        return countSteps(num)+count;


    }










    public static void main(String[] args) {


        System.out.println(productFromNTo1(5, 1));
        System.out.println(productFromNTo1I(5));
        System.out.println(sumFromNTo1(5,0));
        System.out.println(sumFromNTo1I(5));
        System.out.println(sumOfDigits(1234,0));
        System.out.println(sumOfDigitsI(1234));
        System.out.println(productOfDigits(1234,1));
        System.out.println(productOfDigitsI(1234));
        System.out.println(reverseANumber(12345,0));
        System.out.println(reverseANumberI(12345));
        System.out.println(isPalindrome("abccba",0,"abccba".length()-1));
        System.out.println(countZeroes(100302,0));
        System.out.println(countZeroesI(100302));
        System.out.println(countSteps(14));


    }
}
