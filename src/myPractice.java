import java.util.*;

public class myPractice {


    static ArrayList<Integer> func(int[] arr) {

        long n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        long s1 = 0;
        long s1n = (n * (n + 1)) / 2;
        long s2 = 0;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;


        for (int ele : arr) {

            s1 += ele;
            s2 += (long) ele * (long) ele;
        }


        long val1 = s1 - s1n;
        long val2 = s2 - s2n;
        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        result.add((int) x);
        result.add((int) y);
        return result;


    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};


    }

}








