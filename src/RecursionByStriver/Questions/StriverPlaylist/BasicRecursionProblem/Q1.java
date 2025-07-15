package RecursionByStriver.Questions.StriverPlaylist.BasicRecursionProblem;

public class Q1 {

    static void printNames(String str, int n) {

        // print name 5 times

        if (n == 5) return;

        System.out.print(str + " ");
        printNames(str, n + 1);


    }


    static void printFrom1toN(int current, int n) {

        // print From 1 to N

        if (current > n) return;

        System.out.print(current + " ");
        printFrom1toN(current + 1, n);


    }

    public static void main(String[] args) {

        String str = "Rahul";
        printNames(str, 0);

        System.out.println();

        int n = 10;
        printFrom1toN(1, n);


    }
}
