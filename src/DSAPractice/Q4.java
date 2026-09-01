package DSAPractice;

public class Q4 {

    static int secondLargest(int[] arr) {

        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {

                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }

        return secLargest;
    }


    public static void main(String[] args) {

        int[] arr = {9, 8, 9, 6, 9, 5, 8};
        System.out.println(" second largest is :" + secondLargest(arr));

    }
}
