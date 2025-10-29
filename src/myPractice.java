import java.util.HashMap;
import java.util.Stack;

public class myPractice {

    static int func(int[] arr, int goal) {

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += arr[j];

                if (sum == goal) count++;

                if (sum > goal) break;


            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(func(arr, goal));


    }


}

