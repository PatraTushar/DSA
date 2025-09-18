package ArraysbyStriver.strivers;

public class Q4 {

    static int removeDuplicates(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = arr.length;

        if (arr.length < 1) return 0;


        int count = 1;
        int j = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) {

                arr[j] = arr[i];
                j++;
                count++;

            }


        }


        return count;

    }






    public static void main(String[] args) {

        // Remove duplicates in place from sorted array (leeTCode-->26)

        int[] arr={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
