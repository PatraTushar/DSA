package ArraysbyStriver.Basics;

public class arrayIsSortedOrNot {

    static boolean isSorted(int[] arr) {

        if (isAsc(arr)) return true;
        if (isDesc(arr)) return true;

        return false;


    }

    static boolean isAsc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) return false;
        }

        return true;
    }


    static boolean isDesc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) return false;
        }

        return true;
    }


    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(isSorted(arr));


    }
}
