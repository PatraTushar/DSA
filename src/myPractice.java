public class myPractice {

    static boolean isSorted(int[] arr) {

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


    }


}

