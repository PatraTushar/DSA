package ArraysbyStriver.strivers;

public class Q35 {

    static int maximumProductSubArray(int[] arr) {

        // Time Complexity (TC): O(n²)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {

            int ans = 1;

            for (int j = i; j < n; j++) {

                ans *= arr[j];

                max = Math.max(ans, max);


            }


        }

        return max;

    }


    static int maximumProductSubArrayI(int[] arr) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        int MaxProduct = Integer.MIN_VALUE;
        int prefixProduct = 1;
        int suffixProduct = 1;

        for (int i = 0; i < n; i++) {


            if (prefixProduct == 0) prefixProduct = 1;
            if (suffixProduct == 0) suffixProduct = 1;

            prefixProduct *= arr[i];
            suffixProduct *= arr[n - i - 1];


            MaxProduct = Math.max(MaxProduct, Math.max(prefixProduct, suffixProduct));

        }

        return MaxProduct;

    }

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};
        System.out.println(maximumProductSubArray(arr));
        System.out.println(maximumProductSubArrayI(arr));

    }
}
