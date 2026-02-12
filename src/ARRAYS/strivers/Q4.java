package ARRAYS.strivers;

public class Q4 {

    static int removeDuplicates(int[] num) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)
        int n = num.length;
        int idx = 0;

        for (int i = 1; i < n; i++) {

            if (num[i] != num[i - 1]) {

                num[idx++] = num[i - 1];


            }


        }

        num[idx++] = num[n - 1];


        return idx;

    }


    public static void main(String[] args) {

        // (leeTCode-->26)

        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(removeDuplicates(arr));
    }
}
