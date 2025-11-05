package Greedy;

import java.util.HashMap;

public class Q8 {


    static int maximum69Number(int num) {

        //  Time Complexity: O(log10(num))
        //  Space Complexity: O(1)


        int temp = num;
        int placeValue = -1;
        int count = -1;

        while (temp != 0) {

            count++;
            int rem = temp % 10;
            if (rem == 6) placeValue = count;
            temp = temp/ 10;

        }

        if (placeValue == -1) return num;
        return num + 3 * (int) Math.pow(10, placeValue);
    }


    public static void main(String[] args) {

        // leeTCode->1323


        int num = 6969;
        System.out.println(maximum69Number(num));


    }
}
