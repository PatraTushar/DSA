package Recursion.BasicRecursionProblem;

import java.util.Arrays;

public class Basics {

    static void printNames(String str, int n) {

        //TC: O(1) × 5 = O(1)
        //SC: O(1) (stack depth is 5 → constant)

        // print name 5 times

        if (n == 5) return;

        System.out.print(str + " ");
        printNames(str, n + 1);


    }


    static void printFrom1toN(int current, int n) {

        // TC: O(n)
        //SC: O(n) (recursion stack)

        // print From 1 to N

        if (current > n) return;

        System.out.print(current + " ");
        printFrom1toN(current + 1, n);


    }


    // print From  N to 1
    static void printFromNto1(int n) {

        // TC: O(n)
        //SC: O(n) (recursion stack)

        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printFromNto1(n - 1);
    }


    // print From 1 to N by BackTrack
    static void print1toNByBacktrack(int n) {

        // TC: O(n)
        //SC: O(n) (recursion stack)

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        print1toNByBacktrack(n - 1);
        System.out.print(n + " ");


    }


    // print From N to 1 by BackTrack

    static void printFromNTo1ByBacktrack(int current, int n) {

        // TC: O(n)
        //SC: O(n) (recursion stack)

        if (n <= 0) return;

        printFromNTo1ByBacktrack(current + 1, n - 1);
        System.out.print(current + " ");


    }

    // sum of first N numbers

    static int sumOfFirstNNumbers(int sum, int n) {

        // It is parametrized Recursion

        // TC: O(n)
        //SC: O(n) (recursion stack)

        if (n <= 0) return sum;

        return sumOfFirstNNumbers(sum + n, n - 1);


    }

    // sum of first N numbers
    static int sumOfFirstNNumbersI(int n) {

        // It is Functional Recursion

        // TC: O(n)
        //SC: O(n) (recursion stack)

        if (n <= 0) return 0;

        return n + sumOfFirstNNumbersI(n - 1);


    }

    static void reverseArray(int[] arr, int left, int right) {

        // TC: O(n)
        //SC: O(n) (recursion stack)

        // It is Parametrized Recursion

        if (left >= right) return;


        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;


        reverseArray(arr, left+1, right-1);


    }

    static void reverseArrayI(int[] arr,int left,int right){

        // TC: O(n)
        //SC: O(n) (recursion stack)

        // It is Functional Recursion

        if (left >= right) return;


        reverseArray(arr, left+1, right-1);

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;



    }

    static void reverseArrayII(int[] arr,int i,int n){

        // TC: O(n)
        //SC: O(n) (recursion stack)

        // It is Functional Recursion


        if(i>=n/2) return;

        reverseArrayII(arr,i+1,n);

        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;




    }

    // Check if a String is a Palindrome

    static boolean isPalindrome(String str,int left,int right){

        // TC: O(n)
        //SC: O(n) (recursion stack)

        // It is parametrized Recursion

        if(left>=right) return true;

      if(str.charAt(left)!=str.charAt(right)) return false;

      return isPalindrome(str,left+1,right-1);




    }

    static boolean isPalindromeI(String str,int left,int right){

        // TC: O(n)
        //SC: O(n) (recursion stack)

        // It is Functional Recursion

        if(left>=right) return true;


        return isPalindrome(str,left+1,right-1) && str.charAt(left)==str.charAt(right);




    }




    public static void main(String[] args) {

        String str = "Rahul";
        printNames(str, 0);

        System.out.println();

        int n = 10;
        printFrom1toN(1, n);

        System.out.println();

        printFromNto1(n);

        System.out.println();

        print1toNByBacktrack(5);

        System.out.println();

        printFromNTo1ByBacktrack(1, 5);

        System.out.println();

        System.out.println(sumOfFirstNNumbers(0, 5));

        System.out.println(sumOfFirstNNumbersI(5));

        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {4,67,49,29,55};
        reverseArrayII(arr2,0,arr2.length);
        System.out.println(Arrays.toString(arr2));


        int[] arr3 = {1, 2, 3, 4, 5};
        reverseArrayII(arr3,0,arr3.length);
        System.out.println(Arrays.toString(arr3));

        String s="abccba";
        System.out.println(isPalindrome(s,0,s.length()-1));
        System.out.println(isPalindromeI(s,0,s.length()-1));



    }
}
