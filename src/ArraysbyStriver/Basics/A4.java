package ArraysbyStriver.Basics;

public class A4 {

    static boolean isSorted(int[] arr){
        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = arr.length;

        if (n < 2) return true;

        boolean asc = true;
        boolean desc = true;

        for (int i = 1; i < n; i++) {

            asc = asc && (arr[i] >= arr[i - 1]);
            desc = desc && (arr[i] <= arr[i - 1]);

        }

        return asc || desc;




    }

    public static void main(String[] args) {

        // Q: program to check if the array is sorted or not

        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr));

    }
}
