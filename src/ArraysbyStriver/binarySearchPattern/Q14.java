package ArraysbyStriver.binarySearchPattern;

public class Q14 {

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

    static int isValid(int[] arr, int pages) {

        int initialPages = 0;
        int initialStudent = 1;

        for (int ele : arr) {


            if (initialPages + ele <= pages) {

                initialPages += ele;
            } else {

                initialStudent++;
                initialPages = ele;
            }


        }


        return initialStudent;


    }


    static int bookAllocations(int[] books, int students) {

        // Time Complexity: O(n)+O(n)+O(n⋅log(sum−max))=O(n⋅log(sum−max))
        // Space Complexity: O(1)

        if (students > books.length) return -1;

        int start = findMax(books);
        int end = findSum(books);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int validStudent = isValid(books, mid);


            if (validStudent > students) {

                start = mid + 1;

            } else end = mid - 1;


        }

        return start;


    }





    public static void main(String[] args) {

        int[] books = {25, 46, 28, 49, 24};
        int students = 4;
        System.out.println(bookAllocations(books, students));


    }


}


