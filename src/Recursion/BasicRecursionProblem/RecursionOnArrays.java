package Recursion.BasicRecursionProblem;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnArrays {

    static boolean isSorted(int[] arr, int idx) {

        // It is a Functional Recursion

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        if (idx == arr.length - 1) return true;

        if (arr[idx] > arr[idx + 1]) return false;

        return isSorted(arr, idx + 1);


    }

    static void isSortedI(int[] arr, int idx, boolean flag) {

        // It is a parametrized Recursion

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        if (idx == arr.length - 1) {
            System.out.println(flag);
            return;
        }

        if (arr[idx] > arr[idx + 1]) flag = false;


        isSortedI(arr, idx + 1, flag);


    }

    static int linearSearch(int[] arr, int target, int index) {

        // It is a Functional Recursion

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        if (index == arr.length - 1 && arr[index] != target) return -1;

        if (arr[index] == target) return index;


        return linearSearch(arr, target, index + 1);
    }


    static List<Integer> LSonMultipleOccurrences(int[] arr, List<Integer> list, int idx, int target) {

        // It is a parametrized Recursion

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        if (idx == arr.length) {
            return list;
        }

        if (arr[idx] == target) list.add(idx);

        return LSonMultipleOccurrences(arr, list, idx + 1, target);


    }

    static List<Integer> LSonMultipleOccurrencesI(int[] arr, int target, int idx) {

        // It is a Functional Recursion

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        if (idx == arr.length) return new ArrayList<>();

        List<Integer> result = LSonMultipleOccurrencesI(arr, target, idx + 1);

        if (arr[idx] == target) result.add(0, idx);

        return result;


    }

    static int findTargetInRotatedSortedArray(int[] arr, int start, int end, int target) {

        // It is a Parametrized Recursion

        //  Time Complexity (TC): O(log(n))
        // Space Complexity (SC): O(log(n))

        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;

        if (arr[start] <= arr[mid]) {

            if (target >= arr[start] && target < arr[mid]) {

                return findTargetInRotatedSortedArray(arr, start, mid - 1, target);
            }

            return findTargetInRotatedSortedArray(arr, mid + 1, end, target);

        } else {

            if (target > arr[mid] && target <= arr[end]) {


                return findTargetInRotatedSortedArray(arr, mid + 1, end, target);
            }


            return findTargetInRotatedSortedArray(arr, start, mid - 1, target);


        }


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 8, 9, 12};
        System.out.println(isSorted(arr, 0));
        isSortedI(arr, 0, true);
        int[] arr2 = {3, 2, 1, 18, 9};
        System.out.println(linearSearch(arr2, 18, 0));
        int[] arr3 = {3, 2, 1, 5, 1, 6, 1};
        List<Integer> ans = LSonMultipleOccurrences(arr3, new ArrayList<>(), 0, 1);
        System.out.println(ans);
        List<Integer> ans1 = LSonMultipleOccurrencesI(arr3, 1, 0);
        System.out.println(ans1);
        int[] arr4={5,6,7,8,9,1,2,3};
        System.out.println(findTargetInRotatedSortedArray(arr4,0,arr4.length-1,9));


    }
}
