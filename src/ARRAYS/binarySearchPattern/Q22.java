package ARRAYS.binarySearchPattern;

public class Q22 {

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {
                max = ele;
            }
        }

        return max;
    }

    static int findSum(int[] arr) {

        int sum = 0;

        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    static int countStudents(int[] arr, int mid) {

        int totalStudent = 1;
        int totalSum = 0;


        for (int i = 0; i < arr.length; i++) {

            if (totalSum + arr[i] <= mid) {
                totalSum += arr[i];

            } else {
                totalStudent++;
                totalSum = arr[i];
            }

        }
        return totalStudent;


    }

    static int minChocolates(int[] arr, int students) {

        // Time Complexity: O(n.log(sum-max))
        // Space Complexity: O(1)

        if (students > arr.length) return -1;

        int start = findMax(arr);
        int end = findSum(arr);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int totalStudents = countStudents(arr, mid);

            if (totalStudents > students) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int students = 2;
        System.out.println(minChocolates(arr, students));
    }
}
