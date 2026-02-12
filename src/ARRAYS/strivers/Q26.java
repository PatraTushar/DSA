package ARRAYS.strivers;

public class Q26 {

    static double findMedianSortedArrays(int[] arr1, int[] arr2) {    //brute force approach

        //Time Complexity: O(m + n)
        // Space Complexity: O(m + n)

        int m = arr1.length;
        int n = arr2.length;

        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (arr1[i] <= arr2[j]) {

                result[k++] = arr1[i];
                i++;
            } else {

                result[k++] = arr2[j];
                j++;
            }


        }


        while (i < m) {

            result[k++] = arr1[i++];
        }

        while (j < n) {
            result[k++] = arr2[j++];
        }


        int length = result.length;

        if (length % 2 == 0) {

            int mid1 = (length / 2) - 1;
            int mid2 = (length / 2);


            return (result[mid1] + result[mid2]) / 2.0;
        }


        return result[length / 2];
    }

    static double findMedianOf2SortedArrays(int[] arr1, int[] arr2) {  // optimal approach

        // Time Complexity: O(log min(n1,n2))
        // Space Complexity: O(1)

        int m = arr1.length;

        int n = arr2.length;

        if (m > n) return findMedianOf2SortedArrays(arr2, arr1);

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

                if (length % 2 == 0) return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

                else return Math.max(l1, l2);
            } else if (l2 > r1) low = mid1 + 1;

            else high = mid1 - 1;


        }

        return 0;


    }

    public static void main(String[] args) {

        // median of 2 sorted arrays

        int[] arr1 = {1, 3, 4, 7, 10, 12};
        int[] arr2 = {2, 3, 6, 15};


        int[] num1 = {2, 3, 4};
        int[] num2 = {1, 3};


        double ans = findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);
        double result = findMedianOf2SortedArrays(arr1, arr2);
        System.out.println(result);
        double res = findMedianOf2SortedArrays(num1, num2);
        System.out.println(res);

    }
}
