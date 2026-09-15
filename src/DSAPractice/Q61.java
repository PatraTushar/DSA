package DSAPractice;

public class Q61 {

    static int findKthElement(int[] arr1, int[] arr2, int k) {

        int m = arr1.length;
        int n = arr2.length;

        if (m > n) return findKthElement(arr2, arr1, k);




        int low = Math.min(0,k);
        int high = m;

        while (low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = k - mid1;

            int l1 = mid1 > 0 ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = mid2 > 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = mid1 < m ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2 < n ? arr2[mid2] : Integer.MAX_VALUE;


            if (l1 <= r2 && l2 <= r1) {


                return Math.max(l1, l2);

            } else if (l2 > r1) low = mid1 + 1;

            else high = mid1 - 1;

        }


        return 0;


    }

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        int ans = findKthElement(arr1, arr2, k);
        System.out.println(ans);

    }
}
