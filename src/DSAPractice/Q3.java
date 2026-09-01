package DSAPractice;

public class Q3 {

    static int findUnique(int[] arr) {

        int unique = 0;

        for (int ele : arr) {

            unique^=ele;
        }

        return unique;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 1, 3};
        System.out.println(findUnique(arr));
    }
}
