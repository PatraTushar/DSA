package Greedy;

public class Q50 {

    static int findGCD(int num1, int num2) {

        while (num2 != 0) {

            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        return num1;
    }

    static int minOperations(int[] arr) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(1)



        int n = arr.length;
        int count1s = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) count1s++;
        }


        if (count1s > 0) return n - count1s;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int gcd = arr[i];

            for (int j = i + 1; j < n; j++) {

                gcd = findGCD(gcd, arr[j]);

                if (gcd == 1) {

                    int length = j - i + 1;

                   minLength=Math.min(length,minLength);
                   break;


                }
            }



        }


        if (minLength == Integer.MAX_VALUE) return -1;

        return (minLength - 1) + (n - 1) ;


    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 3, 4};
        System.out.println(minOperations(arr));


    }
}
