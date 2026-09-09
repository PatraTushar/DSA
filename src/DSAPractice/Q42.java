package DSAPractice;

public class Q42 {

    static int removeDuplicates(int[] arr) {

        int n = arr.length;
        int idx = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) arr[idx++]=arr[i];

        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(removeDuplicates(arr));
    }
}
