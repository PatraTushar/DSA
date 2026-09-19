//package DSAPractice;
//
//public class Q68 {
//
//    static int totalPairs(int[] arr, int low, int mid, int high) {
//    }
//
//
//    static void merge(int[] arr, int low, int mid, int high) {
//
//
//        int[] res = new int[high - low + 1];
//
//
//        int i = low;
//        int j = mid + 1;
//        int k = 0;
//        int count = 0;
//
//        while (i <= mid && j <= high) {
//
//
//            if (arr[i] > 2 * arr[j]) {
//
//                count += totalPairs(arr, low, mid, high);
//            }
//
//
//            if (arr[i] <= arr[j]) {
//
//                res[k++] = arr[i++];
//            } else {
//
//                res[k++] = arr[j++];
//            }
//
//        }
//
//
//        while (i <= mid) {
//
//            res[k++] = arr[i++];
//        }
//
//
//        while (j <= high) {
//            res[k++] = arr[j++];
//        }
//
//
//        for (int l = 0; l < res.length; l++) {
//
//            arr[low++] = res[l];
//        }
//
//
//    }
//
//    static void mergeSort(int[] arr, int low, int high) {
//
//        if (low == high) return;
//
//
//        int mid = low + (high - low) / 2;
//
//        mergeSort(arr, low, mid);
//        mergeSort(arr, mid + 1, high);
//        merge(arr, low, mid, high);
//
//
//    }
//
//
//    static int reversePairs(int[] arr) {
//
//
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {40, 25, 19, 12, 9, 6, 2};
//        System.out.println(reversePairs(arr));
//    }
//}
