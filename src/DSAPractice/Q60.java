package DSAPractice;

public class Q60 {

    static double findMedianSortedArrays(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        if (m > n) return findMedianSortedArrays(arr2, arr1);
        int length = m + n;
        int partition = (length + 1) / 2;


        int low = 0;
        int high = m;

        while (low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = partition - mid1;

            int l1 = mid1 > 0 ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = mid2 > 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = mid1 < m ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2 < n ? arr2[mid2] : Integer.MAX_VALUE;


            if (l1 <= r2 && l2 <= r1) {

                if (length % 2 == 0) return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else return Math.max(l1, l2);

            } else if (l2 > r1) low = mid1 + 1;

            else high = mid1 - 1;

        }


        return 0;


    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 7, 10, 12};
        int[] arr2 = {2, 3, 6, 15};


        int[] num1 = {2, 3, 4};
        int[] num2 = {1, 3};


        double ans = findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);

    }
}
