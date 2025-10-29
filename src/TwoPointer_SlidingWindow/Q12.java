package TwoPointer_SlidingWindow;

public class Q12 {

    static int numberOfSubArrays(int[] arr, int k) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(1)


        int n = arr.length;
        int totalSubArray = 0;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = i; j < n; j++) {

                if (arr[j] % 2 != 0) count++;

                if (k == count) {

                    totalSubArray++;


                } else if (count > k) break;


            }
        }

        return totalSubArray;
    }


    static int subArraysWithSumLessThanEqualToK(int[] arr, int k) {

        if (k < 0) return 0;

        int n = arr.length;
        int totalNiceSubArray = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right] % 2;


            while (sum > k) {

                sum -= arr[left] % 2;
                left++;
            }

            totalNiceSubArray += (right - left + 1);


        }

        return totalNiceSubArray;
    }

    static int numberOfSubArraysI(int[] arr, int k) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        return subArraysWithSumLessThanEqualToK(arr, k) - subArraysWithSumLessThanEqualToK(arr, k - 1);
    }


    public static void main(String[] args) {

        // leeTCode->1248

        int[] arr = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(numberOfSubArrays(arr, k));
        System.out.println(numberOfSubArraysI(arr, k));

    }
}
