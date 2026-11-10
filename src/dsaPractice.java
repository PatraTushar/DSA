public class dsaPractice {


    static int secondLargest(int[] arr) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > firstLargest) {

                secondLargest = firstLargest;
                firstLargest = ele;
            } else if (ele < firstLargest && ele > secondLargest) {

                secondLargest = ele;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {9, 8, 9, 6, 9, 5, 8};
        System.out.println(" second largest is :" + secondLargest(arr));
    }
}


