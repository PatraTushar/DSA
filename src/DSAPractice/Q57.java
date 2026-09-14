//package DSAPractice;
//
//public class Q57 {
//
//    static void swap(int[] arr1, int[] arr2, int i, int j) {
//
//        if (arr1[i] > arr2[j]) {
//
//            int temp = arr1[i];
//            arr1[i] = arr2[j];
//            arr2[j] = temp;
//        }
//
//    }
//
//    static void merge(int[] arr1, int[] arr2) {
//
//        int m = arr1.length;
//        int n = arr2.length;
//
//        int length = m + n;
//        int gap = length % 2 + length / 2;
//
//        while (gap > 0) {
//
//            int i = 0;
//            int j = gap;
//
//            while (j < n) {
//
//                if (i < m && j < m) {
//
//                    swap(arr1, arr1, i, j);
//
//                } else if (i < m && j >= m){
//
//                    swap(arr1,arr2,i,j-m);
//                }
//
//
//                else swap(arr2,arr2,i-m,j-m);
//
//
//            }
//
//
//
//
//
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//        int[] arr1 = {1, 3, 5, 7};
//        int[] arr2 = {0, 2, 6, 8, 9};
//        merge(arr1, arr2);
//
//    }
//}
