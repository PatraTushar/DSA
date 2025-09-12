package ArraysbyStriver.interviewQuestions;


public class Q6 {

    static int secondLargest(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > largest) {
                secLargest = largest;
                largest = ele;
            } else if (ele > secLargest && ele != largest) {

                secLargest = ele;

            }

        }
        return secLargest;
    }

    public static void main(String[] args) {

        // Q: Program to find the second Largest element in the given array

        int[] arr = {9, 8, 9, 6, 9, 5, 8};
        System.out.println(" second largest is :" + secondLargest(arr));


    }
}
