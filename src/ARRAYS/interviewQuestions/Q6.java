package ARRAYS.interviewQuestions;


public class Q6 {

    static int secondLargest(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

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

        // Q: Program to find the second Largest element in the given array

        int[] arr = {9, 8, 9, 6, 9, 5, 8};
        System.out.println(" second largest is :" + secondLargest(arr));

        int[] num={5,5,5,5};
        System.out.println(secondLargest(num));


    }
}
