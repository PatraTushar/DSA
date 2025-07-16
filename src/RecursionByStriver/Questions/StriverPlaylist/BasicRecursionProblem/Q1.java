package RecursionByStriver.Questions.StriverPlaylist.BasicRecursionProblem;

public class Q1 {

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

    static void printFromNTo1ByBacktrack(int current,int n){

        // TC: O(n)
        //SC: O(n) (recursion stack)

        if(n<=0) return;

        printFromNTo1ByBacktrack(current+1,n-1);
        System.out.print(current+" ");



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

        printFromNTo1ByBacktrack(1,5);


    }
}
