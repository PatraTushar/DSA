package DSAPractice;

import OOPS.AccessModifier.Public.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q50 {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

    static int[] rearrangeElementsBySign(int[] arr) {

        // equal number of positive and negative and the order is preserved

        int n = arr.length;
        int[] res = new int[n];
        int positive = 0;
        int negative = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                res[positive] = arr[i];
                positive += 2;
            } else {
                res[negative] = arr[i];
                negative += 2;
            }

        }

        return res;
    }

    static int[] rearrangeElementsBySignI(int[] arr) {

        // equal number of positive and negative and the order is not preserved

        int n = arr.length;
        int positive = 0;
        int negative = 1;

        while (positive < n - 1 && negative < n) {

            if (arr[positive] > 0) positive += 2;
            else if (arr[negative] < 0) negative += 2;
            else {

                swap(arr, positive, negative);
                positive += 2;
                negative += 2;

            }
        }

        return arr;


    }


    static int[] rearrange(int[] arr) {

        // positives and negatives are not equal

        int n = arr.length;

        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        int[] res = new int[n];

        for (int ele : arr) {
            if (ele > 0) positives.add(ele);
            else negatives.add(ele);
        }


        int i = 0;
        int j = 0;
        int k = 0;

        while (i < positives.size() && j < negatives.size()) {

            res[k++] = positives.get(i);
            res[k++] = negatives.get(j);

            i++;
            j++;

        }

        while (i < positives.size()) {
            res[k++] = positives.get(i);
            i++;
        }

        while (j<negatives.size()){
            res[k++]=negatives.get(j);
            j++;
        }

        return res;


    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, -12, -5, -4};
        int[] Ans = rearrangeElementsBySign(arr);
        System.out.println(Arrays.toString(Ans));
        int[] Ans1 = rearrangeElementsBySignI(arr);
        System.out.println(Arrays.toString(Ans1));

        int[] arr1 = {-1, 2, 3, 4, -3, 1};
        int[] ans = rearrange(arr1);
        System.out.println(Arrays.toString(ans));
    }
}
