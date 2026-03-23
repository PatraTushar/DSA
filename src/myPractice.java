import java.util.Arrays;

public class myPractice {


    static int func(int[] arr, int x) {

        int n = arr.length;

        int low = 1;
        int high = x;


        while (low <= high) {

            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square==x) return mid;

           else if (square > x) high = mid - 1;

            else low = mid + 1;

        }

        return high;


    }


    public static void main(String[] args) {


        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println(func(arr, target));

    }


}




