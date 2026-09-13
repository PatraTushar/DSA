package DSAPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Q52 {

    static ArrayList<Integer> leader(int[] arr) {

        int n = arr.length;
        int largest = arr[n - 1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > largest) {

                res.add(arr[i]);
                largest = arr[i];
            }


        }

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = leader(arr);
        System.out.println(ans);
    }
}
