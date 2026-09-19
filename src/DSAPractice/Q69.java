package DSAPractice;

public class Q69 {

    static int maximumProductSubArray(int[] nums) {

        int n = nums.length;

        int prefixProduct = 1;
        int suffixProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (prefixProduct == 0) prefixProduct = 1;
            if (suffixProduct == 0) suffixProduct = 1;


            prefixProduct *= nums[i];
            suffixProduct *=nums[n - (i + 1)];


            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));


        }

        return maxProduct;
    }

    public static void main(String[] args) {


        int[] arr = {2, 3, -2, 4};
        System.out.println(maximumProductSubArray(arr));

    }
}
