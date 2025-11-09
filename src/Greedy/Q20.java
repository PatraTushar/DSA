package Greedy;

public class Q20 {

    static int maximumScore(int[] arr, int k) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = arr.length;

        int i = k;
        int j = k;

        int currMin = arr[k];
        int result = arr[k];

        while (i > 0 && j < n - 1) {

            if (arr[j + 1] > arr[i - 1]) {

                j++;
                currMin = Math.min(currMin, arr[j]);

            } else {

                i--;
                currMin = Math.min(currMin, arr[i]);

            }

            result = Math.max(result, currMin * (j - i + 1));


        }


        while (i > 0) {

            i--;
            currMin = Math.min(currMin, arr[i]);
            result = Math.max(result, currMin * (j - i + 1));
        }


        while (j < n - 1) {

            j++;
            currMin = Math.min(currMin, arr[j]);
            result = Math.max(result, currMin * (j - i + 1));
        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->1793

        int[] arr = {1, 4, 3, 7, 4, 5};
        int k = 3;
        System.out.println(maximumScore(arr, k));
    }
}
